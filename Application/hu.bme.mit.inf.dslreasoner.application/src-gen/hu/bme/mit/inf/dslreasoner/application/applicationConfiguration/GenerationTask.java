/**
 * generated by Xtext 2.21.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getPartialModel <em>Partial Model</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getScope <em>Scope</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#isNumberSpecified <em>Number Specified</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getNumber <em>Number</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#isRunSpecified <em>Run Specified</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getRuns <em>Runs</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getSolver <em>Solver</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getConfig <em>Config</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getDebugFolder <em>Debug Folder</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getTargetLogFile <em>Target Log File</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getTargetStatisticsFile <em>Target Statistics File</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getTagetFolder <em>Taget Folder</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask()
 * @model
 * @generated
 */
public interface GenerationTask extends Task
{
  /**
   * Returns the value of the '<em><b>Metamodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel</em>' containment reference.
   * @see #setMetamodel(Metamodel)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_Metamodel()
   * @model containment="true"
   * @generated
   */
  Metamodel getMetamodel();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getMetamodel <em>Metamodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metamodel</em>' containment reference.
   * @see #getMetamodel()
   * @generated
   */
  void setMetamodel(Metamodel value);

  /**
   * Returns the value of the '<em><b>Partial Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial Model</em>' containment reference.
   * @see #setPartialModel(PartialModel)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_PartialModel()
   * @model containment="true"
   * @generated
   */
  PartialModel getPartialModel();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getPartialModel <em>Partial Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial Model</em>' containment reference.
   * @see #getPartialModel()
   * @generated
   */
  void setPartialModel(PartialModel value);

  /**
   * Returns the value of the '<em><b>Patterns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patterns</em>' containment reference.
   * @see #setPatterns(GraphPattern)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_Patterns()
   * @model containment="true"
   * @generated
   */
  GraphPattern getPatterns();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getPatterns <em>Patterns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Patterns</em>' containment reference.
   * @see #getPatterns()
   * @generated
   */
  void setPatterns(GraphPattern value);

  /**
   * Returns the value of the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' containment reference.
   * @see #setScope(Scope)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_Scope()
   * @model containment="true"
   * @generated
   */
  Scope getScope();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getScope <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' containment reference.
   * @see #getScope()
   * @generated
   */
  void setScope(Scope value);

  /**
   * Returns the value of the '<em><b>Number Specified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Specified</em>' attribute.
   * @see #setNumberSpecified(boolean)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_NumberSpecified()
   * @model
   * @generated
   */
  boolean isNumberSpecified();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#isNumberSpecified <em>Number Specified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Specified</em>' attribute.
   * @see #isNumberSpecified()
   * @generated
   */
  void setNumberSpecified(boolean value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Run Specified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run Specified</em>' attribute.
   * @see #setRunSpecified(boolean)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_RunSpecified()
   * @model
   * @generated
   */
  boolean isRunSpecified();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#isRunSpecified <em>Run Specified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Run Specified</em>' attribute.
   * @see #isRunSpecified()
   * @generated
   */
  void setRunSpecified(boolean value);

  /**
   * Returns the value of the '<em><b>Runs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Runs</em>' attribute.
   * @see #setRuns(int)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_Runs()
   * @model
   * @generated
   */
  int getRuns();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getRuns <em>Runs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Runs</em>' attribute.
   * @see #getRuns()
   * @generated
   */
  void setRuns(int value);

  /**
   * Returns the value of the '<em><b>Solver</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.Solver}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Solver</em>' attribute.
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.Solver
   * @see #setSolver(Solver)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_Solver()
   * @model
   * @generated
   */
  Solver getSolver();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getSolver <em>Solver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Solver</em>' attribute.
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.Solver
   * @see #getSolver()
   * @generated
   */
  void setSolver(Solver value);

  /**
   * Returns the value of the '<em><b>Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config</em>' containment reference.
   * @see #setConfig(Config)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_Config()
   * @model containment="true"
   * @generated
   */
  Config getConfig();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getConfig <em>Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Config</em>' containment reference.
   * @see #getConfig()
   * @generated
   */
  void setConfig(Config value);

  /**
   * Returns the value of the '<em><b>Debug Folder</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debug Folder</em>' containment reference.
   * @see #setDebugFolder(File)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_DebugFolder()
   * @model containment="true"
   * @generated
   */
  File getDebugFolder();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getDebugFolder <em>Debug Folder</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug Folder</em>' containment reference.
   * @see #getDebugFolder()
   * @generated
   */
  void setDebugFolder(File value);

  /**
   * Returns the value of the '<em><b>Target Log File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Log File</em>' containment reference.
   * @see #setTargetLogFile(File)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_TargetLogFile()
   * @model containment="true"
   * @generated
   */
  File getTargetLogFile();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getTargetLogFile <em>Target Log File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Log File</em>' containment reference.
   * @see #getTargetLogFile()
   * @generated
   */
  void setTargetLogFile(File value);

  /**
   * Returns the value of the '<em><b>Target Statistics File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Statistics File</em>' containment reference.
   * @see #setTargetStatisticsFile(File)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_TargetStatisticsFile()
   * @model containment="true"
   * @generated
   */
  File getTargetStatisticsFile();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getTargetStatisticsFile <em>Target Statistics File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Statistics File</em>' containment reference.
   * @see #getTargetStatisticsFile()
   * @generated
   */
  void setTargetStatisticsFile(File value);

  /**
   * Returns the value of the '<em><b>Taget Folder</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Taget Folder</em>' containment reference.
   * @see #setTagetFolder(File)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getGenerationTask_TagetFolder()
   * @model containment="true"
   * @generated
   */
  File getTagetFolder();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask#getTagetFolder <em>Taget Folder</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Taget Folder</em>' containment reference.
   * @see #getTagetFolder()
   * @generated
   */
  void setTagetFolder(File value);

} // GenerationTask
