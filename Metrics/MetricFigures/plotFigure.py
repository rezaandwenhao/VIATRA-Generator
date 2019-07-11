import csv
import numpy as np
import matplotlib.pyplot as plt
from os import listdir, mkdir, path

def main():
	#fileNames = ['statsNA', 'statsMPC', 'statsEDA']
	sources = [
			'A0'
			, 'A20'
			, 'Human'
			, 'RandomEMF-WF+7'
			, 'RandomEMF30'
			, 'VS-i'
			, 'VS-WF+All5'
			, 'VS-WF+All6'
			, 'VS-WF+All7'
			, 'VS+i'
			]
	numSources = len(sources)

	metrics = ['SQRmax']

	allSources = [[] *  numSources for i in range(numSources)]
	allSourcesX = [[] *  numSources for i in range(numSources)]
		
	for metricName in metrics :
		srcInd = 0
		for sourceName in sources:
			csvLocation = '../ca.mcgill.ecse.dslreasoner.realistic.metrics/outputs/calculatedMetrics/'
			csvFileName = sourceName + '/' + metricName

			#Make paths if inexistant
			dirPathName = 'outputs/' + sourceName
			pathName = dirPathName + '/' + metricName + ".png"
			createFiles(dirPathName, pathName)

			#Manipulations
			with open(csvLocation + csvFileName + '.csv') as f:
				reader = csv.reader(f, delimiter=',')
				ind = 0
				for row in reader:
					rowName = row[0] + row[1]
					rowVals = [float(i) for i in row[2:]]
					allSources[srcInd] = [i for i in rowVals]	
					#Operations
					rowVals.sort()
					maxVal = max(rowVals)
					rowVals = [i/maxVal for i in rowVals]					
					#End Operations
					if ind == 0 :
						plt.plot(rowVals, label = rowName, lineWidth = 3)
					else :
						plt.plot(rowVals, label = rowName, alpha = 0.5)
					ind += 1			

			#INDIVIDUAL FIGURES
			#plt.title("Node Activity measurement w/ and w/o neighbourhood")
			plt.title(metricName + " measurement for " + sourceName)
			plt.ylabel("Metric value")
			plt.xlabel("Different models")
		#	plt.ylim(bottom=0, top=5)
			plt.legend()
			plt.savefig(pathName)
			#plt.show()
			plt.clf()

			srcInd += 1

		#COMPILATION FIGURE
		#Make paths if inexistant
		dirPathName = 'outputs/_Cumulative'
		pathName = dirPathName + '/' + metricName + ".png"
		createFiles(dirPathName, pathName)

		maxModels = 0
		maxMetVal = 0

		for i in range(numSources) :
			allSources[i].sort()
			allSources[i] = [j for j in allSources[i]]

			###for normalizing number of models
			numModels = len(allSources[i])
			if numModels > maxModels :
				maxModels = numModels

			###for normalizing metric values
			locMaxMetVal = max(allSources[i])
			if locMaxMetVal > maxMetVal :
				maxMetVal = locMaxMetVal
		
		for i in range(numSources) :
			numModels = len(allSources[i])

			###normalize number of models to (max number of models, 1)
			#allSourcesX[i] = np.arange(0, maxModels, float(maxModels) / numModels) 
			allSourcesX[i] = np.arange(0, 1, 1 / numModels) 

			###normalize metric values to (max Metric Value, 1)
			currentMax = max(allSources[i])
			#allSources[i] = [j * maxMetVal / currentMax for j in allSources[i]]
			#allSources[i] = [j / currentMax for j in allSources[i]]


			plt.plot(allSources[i], allSourcesX[i], label = sources[i], lineWidth = 3)
		
		plt.title(metricName + " measurement for all sources")
		plt.ylabel("Metric value")
		plt.xlabel("Different models")
	#	plt.ylim(bottom=0, top=5)
		plt.legend()
		plt.savefig(pathName)
		plt.show()
		plt.clf()


def createFiles(dirPathName, pathName) :
	if not path.exists(dirPathName) :
		mkdir(dirPathName)
	if not path.exists(pathName) :
		open(pathName, 'a').close()

	
if __name__== "__main__":
	main()