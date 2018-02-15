/**
 * generated by Xtext 2.10.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl;

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationConfigurationFactoryImpl extends EFactoryImpl implements ApplicationConfigurationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ApplicationConfigurationFactory init()
  {
    try
    {
      ApplicationConfigurationFactory theApplicationConfigurationFactory = (ApplicationConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory(ApplicationConfigurationPackage.eNS_URI);
      if (theApplicationConfigurationFactory != null)
      {
        return theApplicationConfigurationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ApplicationConfigurationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationConfigurationFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ApplicationConfigurationPackage.CONFIGURATION_SCRIPT: return createConfigurationScript();
      case ApplicationConfigurationPackage.COMMAND: return createCommand();
      case ApplicationConfigurationPackage.IMPORT: return createImport();
      case ApplicationConfigurationPackage.EPACKAGE_IMPORT: return createEPackageImport();
      case ApplicationConfigurationPackage.VIATRA_IMPORT: return createViatraImport();
      case ApplicationConfigurationPackage.DECLARATION: return createDeclaration();
      case ApplicationConfigurationPackage.FILE_SPECIFICATION: return createFileSpecification();
      case ApplicationConfigurationPackage.FILE_DECLARATION: return createFileDeclaration();
      case ApplicationConfigurationPackage.FILE_REFERENCE: return createFileReference();
      case ApplicationConfigurationPackage.FILE: return createFile();
      case ApplicationConfigurationPackage.METAMODEL_SPECIFICATION: return createMetamodelSpecification();
      case ApplicationConfigurationPackage.METAMODEL_ENTRY: return createMetamodelEntry();
      case ApplicationConfigurationPackage.ALL_PACKAGE_ENTRY: return createAllPackageEntry();
      case ApplicationConfigurationPackage.METAMODEL_ELEMENT: return createMetamodelElement();
      case ApplicationConfigurationPackage.METAMODEL_DECLARATION: return createMetamodelDeclaration();
      case ApplicationConfigurationPackage.METAMODEL_REFERENCE: return createMetamodelReference();
      case ApplicationConfigurationPackage.METAMODEL: return createMetamodel();
      case ApplicationConfigurationPackage.PARTIAL_MODEL_SPECIFICATION: return createPartialModelSpecification();
      case ApplicationConfigurationPackage.PARTIAL_MODEL_ENTRY: return createPartialModelEntry();
      case ApplicationConfigurationPackage.MODEL_ENTRY: return createModelEntry();
      case ApplicationConfigurationPackage.FOLDER_ENTRY: return createFolderEntry();
      case ApplicationConfigurationPackage.PARTIAL_MODEL_DECLARATION: return createPartialModelDeclaration();
      case ApplicationConfigurationPackage.PARTIAL_MODEL_REFERENCE: return createPartialModelReference();
      case ApplicationConfigurationPackage.PARTIAL_MODEL: return createPartialModel();
      case ApplicationConfigurationPackage.PATTERN_SPECIFICATION: return createPatternSpecification();
      case ApplicationConfigurationPackage.PATTERN_ENTRY: return createPatternEntry();
      case ApplicationConfigurationPackage.ALL_PATTERN_ENTRY: return createAllPatternEntry();
      case ApplicationConfigurationPackage.PATTERN_ELEMENT: return createPatternElement();
      case ApplicationConfigurationPackage.GRAPH_PATTERN_DECLARATION: return createGraphPatternDeclaration();
      case ApplicationConfigurationPackage.GRAPH_PATTERN_REFERENCE: return createGraphPatternReference();
      case ApplicationConfigurationPackage.GRAPH_PATTERN: return createGraphPattern();
      case ApplicationConfigurationPackage.CONFIG_SPECIFICATION: return createConfigSpecification();
      case ApplicationConfigurationPackage.CONFIG_DECLARATION: return createConfigDeclaration();
      case ApplicationConfigurationPackage.CONFIG_ENTRY: return createConfigEntry();
      case ApplicationConfigurationPackage.CONFIG_REFERENCE: return createConfigReference();
      case ApplicationConfigurationPackage.CONFIG: return createConfig();
      case ApplicationConfigurationPackage.SCOPE_SPECIFICATION: return createScopeSpecification();
      case ApplicationConfigurationPackage.TYPE_SCOPE: return createTypeScope();
      case ApplicationConfigurationPackage.CLASS_TYPE_SCOPE: return createClassTypeScope();
      case ApplicationConfigurationPackage.OBJECT_TYPE_SCOPE: return createObjectTypeScope();
      case ApplicationConfigurationPackage.INTEGER_TYPE_SCOPE: return createIntegerTypeScope();
      case ApplicationConfigurationPackage.REAL_TYPE_SCOPE: return createRealTypeScope();
      case ApplicationConfigurationPackage.STRING_TYPE_SCOPE: return createStringTypeScope();
      case ApplicationConfigurationPackage.TYPE_REFERENCE: return createTypeReference();
      case ApplicationConfigurationPackage.CLASS_REFERENCE: return createClassReference();
      case ApplicationConfigurationPackage.OBJECT_REFERENCE: return createObjectReference();
      case ApplicationConfigurationPackage.INTEGER_REFERENCE: return createIntegerReference();
      case ApplicationConfigurationPackage.REAL_REFERENCE: return createRealReference();
      case ApplicationConfigurationPackage.STRING_REFERENCE: return createStringReference();
      case ApplicationConfigurationPackage.NUMBER_SPECIFICATION: return createNumberSpecification();
      case ApplicationConfigurationPackage.EXACT_NUMBER: return createExactNumber();
      case ApplicationConfigurationPackage.INTERVALL_NUMBER: return createIntervallNumber();
      case ApplicationConfigurationPackage.INT_ENUMBERATION: return createIntEnumberation();
      case ApplicationConfigurationPackage.REAL_ENUMERATION: return createRealEnumeration();
      case ApplicationConfigurationPackage.STRING_ENUMERATION: return createStringEnumeration();
      case ApplicationConfigurationPackage.SCOPE_DECLARATION: return createScopeDeclaration();
      case ApplicationConfigurationPackage.SCOPE_REFERENCE: return createScopeReference();
      case ApplicationConfigurationPackage.SCOPE: return createScope();
      case ApplicationConfigurationPackage.TASK: return createTask();
      case ApplicationConfigurationPackage.GENERATION_TASK: return createGenerationTask();
      case ApplicationConfigurationPackage.INTEGER_SCOPE: return createIntegerScope();
      case ApplicationConfigurationPackage.REAL_SCOPE: return createRealScope();
      case ApplicationConfigurationPackage.STRING_SCOPE: return createStringScope();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ApplicationConfigurationPackage.SOLVER:
        return createSolverFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ApplicationConfigurationPackage.SOLVER:
        return convertSolverToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurationScript createConfigurationScript()
  {
    ConfigurationScriptImpl configurationScript = new ConfigurationScriptImpl();
    return configurationScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackageImport createEPackageImport()
  {
    EPackageImportImpl ePackageImport = new EPackageImportImpl();
    return ePackageImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViatraImport createViatraImport()
  {
    ViatraImportImpl viatraImport = new ViatraImportImpl();
    return viatraImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileSpecification createFileSpecification()
  {
    FileSpecificationImpl fileSpecification = new FileSpecificationImpl();
    return fileSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileDeclaration createFileDeclaration()
  {
    FileDeclarationImpl fileDeclaration = new FileDeclarationImpl();
    return fileDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileReference createFileReference()
  {
    FileReferenceImpl fileReference = new FileReferenceImpl();
    return fileReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelSpecification createMetamodelSpecification()
  {
    MetamodelSpecificationImpl metamodelSpecification = new MetamodelSpecificationImpl();
    return metamodelSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelEntry createMetamodelEntry()
  {
    MetamodelEntryImpl metamodelEntry = new MetamodelEntryImpl();
    return metamodelEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllPackageEntry createAllPackageEntry()
  {
    AllPackageEntryImpl allPackageEntry = new AllPackageEntryImpl();
    return allPackageEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelElement createMetamodelElement()
  {
    MetamodelElementImpl metamodelElement = new MetamodelElementImpl();
    return metamodelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelDeclaration createMetamodelDeclaration()
  {
    MetamodelDeclarationImpl metamodelDeclaration = new MetamodelDeclarationImpl();
    return metamodelDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelReference createMetamodelReference()
  {
    MetamodelReferenceImpl metamodelReference = new MetamodelReferenceImpl();
    return metamodelReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metamodel createMetamodel()
  {
    MetamodelImpl metamodel = new MetamodelImpl();
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialModelSpecification createPartialModelSpecification()
  {
    PartialModelSpecificationImpl partialModelSpecification = new PartialModelSpecificationImpl();
    return partialModelSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialModelEntry createPartialModelEntry()
  {
    PartialModelEntryImpl partialModelEntry = new PartialModelEntryImpl();
    return partialModelEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelEntry createModelEntry()
  {
    ModelEntryImpl modelEntry = new ModelEntryImpl();
    return modelEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FolderEntry createFolderEntry()
  {
    FolderEntryImpl folderEntry = new FolderEntryImpl();
    return folderEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialModelDeclaration createPartialModelDeclaration()
  {
    PartialModelDeclarationImpl partialModelDeclaration = new PartialModelDeclarationImpl();
    return partialModelDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialModelReference createPartialModelReference()
  {
    PartialModelReferenceImpl partialModelReference = new PartialModelReferenceImpl();
    return partialModelReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartialModel createPartialModel()
  {
    PartialModelImpl partialModel = new PartialModelImpl();
    return partialModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternSpecification createPatternSpecification()
  {
    PatternSpecificationImpl patternSpecification = new PatternSpecificationImpl();
    return patternSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternEntry createPatternEntry()
  {
    PatternEntryImpl patternEntry = new PatternEntryImpl();
    return patternEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllPatternEntry createAllPatternEntry()
  {
    AllPatternEntryImpl allPatternEntry = new AllPatternEntryImpl();
    return allPatternEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternElement createPatternElement()
  {
    PatternElementImpl patternElement = new PatternElementImpl();
    return patternElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphPatternDeclaration createGraphPatternDeclaration()
  {
    GraphPatternDeclarationImpl graphPatternDeclaration = new GraphPatternDeclarationImpl();
    return graphPatternDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphPatternReference createGraphPatternReference()
  {
    GraphPatternReferenceImpl graphPatternReference = new GraphPatternReferenceImpl();
    return graphPatternReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphPattern createGraphPattern()
  {
    GraphPatternImpl graphPattern = new GraphPatternImpl();
    return graphPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigSpecification createConfigSpecification()
  {
    ConfigSpecificationImpl configSpecification = new ConfigSpecificationImpl();
    return configSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigDeclaration createConfigDeclaration()
  {
    ConfigDeclarationImpl configDeclaration = new ConfigDeclarationImpl();
    return configDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigEntry createConfigEntry()
  {
    ConfigEntryImpl configEntry = new ConfigEntryImpl();
    return configEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigReference createConfigReference()
  {
    ConfigReferenceImpl configReference = new ConfigReferenceImpl();
    return configReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Config createConfig()
  {
    ConfigImpl config = new ConfigImpl();
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeSpecification createScopeSpecification()
  {
    ScopeSpecificationImpl scopeSpecification = new ScopeSpecificationImpl();
    return scopeSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeScope createTypeScope()
  {
    TypeScopeImpl typeScope = new TypeScopeImpl();
    return typeScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassTypeScope createClassTypeScope()
  {
    ClassTypeScopeImpl classTypeScope = new ClassTypeScopeImpl();
    return classTypeScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectTypeScope createObjectTypeScope()
  {
    ObjectTypeScopeImpl objectTypeScope = new ObjectTypeScopeImpl();
    return objectTypeScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerTypeScope createIntegerTypeScope()
  {
    IntegerTypeScopeImpl integerTypeScope = new IntegerTypeScopeImpl();
    return integerTypeScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealTypeScope createRealTypeScope()
  {
    RealTypeScopeImpl realTypeScope = new RealTypeScopeImpl();
    return realTypeScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringTypeScope createStringTypeScope()
  {
    StringTypeScopeImpl stringTypeScope = new StringTypeScopeImpl();
    return stringTypeScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference createTypeReference()
  {
    TypeReferenceImpl typeReference = new TypeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassReference createClassReference()
  {
    ClassReferenceImpl classReference = new ClassReferenceImpl();
    return classReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectReference createObjectReference()
  {
    ObjectReferenceImpl objectReference = new ObjectReferenceImpl();
    return objectReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerReference createIntegerReference()
  {
    IntegerReferenceImpl integerReference = new IntegerReferenceImpl();
    return integerReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealReference createRealReference()
  {
    RealReferenceImpl realReference = new RealReferenceImpl();
    return realReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringReference createStringReference()
  {
    StringReferenceImpl stringReference = new StringReferenceImpl();
    return stringReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberSpecification createNumberSpecification()
  {
    NumberSpecificationImpl numberSpecification = new NumberSpecificationImpl();
    return numberSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExactNumber createExactNumber()
  {
    ExactNumberImpl exactNumber = new ExactNumberImpl();
    return exactNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntervallNumber createIntervallNumber()
  {
    IntervallNumberImpl intervallNumber = new IntervallNumberImpl();
    return intervallNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntEnumberation createIntEnumberation()
  {
    IntEnumberationImpl intEnumberation = new IntEnumberationImpl();
    return intEnumberation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealEnumeration createRealEnumeration()
  {
    RealEnumerationImpl realEnumeration = new RealEnumerationImpl();
    return realEnumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringEnumeration createStringEnumeration()
  {
    StringEnumerationImpl stringEnumeration = new StringEnumerationImpl();
    return stringEnumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeDeclaration createScopeDeclaration()
  {
    ScopeDeclarationImpl scopeDeclaration = new ScopeDeclarationImpl();
    return scopeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeReference createScopeReference()
  {
    ScopeReferenceImpl scopeReference = new ScopeReferenceImpl();
    return scopeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scope createScope()
  {
    ScopeImpl scope = new ScopeImpl();
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenerationTask createGenerationTask()
  {
    GenerationTaskImpl generationTask = new GenerationTaskImpl();
    return generationTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerScope createIntegerScope()
  {
    IntegerScopeImpl integerScope = new IntegerScopeImpl();
    return integerScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealScope createRealScope()
  {
    RealScopeImpl realScope = new RealScopeImpl();
    return realScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringScope createStringScope()
  {
    StringScopeImpl stringScope = new StringScopeImpl();
    return stringScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Solver createSolverFromString(EDataType eDataType, String initialValue)
  {
    Solver result = Solver.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSolverToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationConfigurationPackage getApplicationConfigurationPackage()
  {
    return (ApplicationConfigurationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ApplicationConfigurationPackage getPackage()
  {
    return ApplicationConfigurationPackage.eINSTANCE;
  }

} //ApplicationConfigurationFactoryImpl
