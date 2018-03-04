/**
 * generated by Xtext 2.12.0
 */
package hu.bme.mit.inf.dslreasoner.vampireLanguage.util;

import hu.bme.mit.inf.dslreasoner.vampireLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguagePackage
 * @generated
 */
public class VampireLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VampireLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VampireLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = VampireLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VampireLanguageSwitch<Adapter> modelSwitch =
    new VampireLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseVampireModel(VampireModel object)
      {
        return createVampireModelAdapter();
      }
      @Override
      public Adapter caseVLSComment(VLSComment object)
      {
        return createVLSCommentAdapter();
      }
      @Override
      public Adapter caseVLSFofFormula(VLSFofFormula object)
      {
        return createVLSFofFormulaAdapter();
      }
      @Override
      public Adapter caseVLSAnnotation(VLSAnnotation object)
      {
        return createVLSAnnotationAdapter();
      }
      @Override
      public Adapter caseVLSTerm(VLSTerm object)
      {
        return createVLSTermAdapter();
      }
      @Override
      public Adapter caseVLSFunctionFof(VLSFunctionFof object)
      {
        return createVLSFunctionFofAdapter();
      }
      @Override
      public Adapter caseVLSDefinedTerm(VLSDefinedTerm object)
      {
        return createVLSDefinedTermAdapter();
      }
      @Override
      public Adapter caseVLSEquivalent(VLSEquivalent object)
      {
        return createVLSEquivalentAdapter();
      }
      @Override
      public Adapter caseVLSImplies(VLSImplies object)
      {
        return createVLSImpliesAdapter();
      }
      @Override
      public Adapter caseVLSRevImplies(VLSRevImplies object)
      {
        return createVLSRevImpliesAdapter();
      }
      @Override
      public Adapter caseVLSXnor(VLSXnor object)
      {
        return createVLSXnorAdapter();
      }
      @Override
      public Adapter caseVLSNor(VLSNor object)
      {
        return createVLSNorAdapter();
      }
      @Override
      public Adapter caseVLSNand(VLSNand object)
      {
        return createVLSNandAdapter();
      }
      @Override
      public Adapter caseVLSAnd(VLSAnd object)
      {
        return createVLSAndAdapter();
      }
      @Override
      public Adapter caseVLSOr(VLSOr object)
      {
        return createVLSOrAdapter();
      }
      @Override
      public Adapter caseVLSUniversalQuantifier(VLSUniversalQuantifier object)
      {
        return createVLSUniversalQuantifierAdapter();
      }
      @Override
      public Adapter caseVLSExistentialQuantifier(VLSExistentialQuantifier object)
      {
        return createVLSExistentialQuantifierAdapter();
      }
      @Override
      public Adapter caseVLSUnaryNegation(VLSUnaryNegation object)
      {
        return createVLSUnaryNegationAdapter();
      }
      @Override
      public Adapter caseVLSInequality(VLSInequality object)
      {
        return createVLSInequalityAdapter();
      }
      @Override
      public Adapter caseVLSEquality(VLSEquality object)
      {
        return createVLSEqualityAdapter();
      }
      @Override
      public Adapter caseVLSAssignment(VLSAssignment object)
      {
        return createVLSAssignmentAdapter();
      }
      @Override
      public Adapter caseVLSConstant(VLSConstant object)
      {
        return createVLSConstantAdapter();
      }
      @Override
      public Adapter caseVLSTrue(VLSTrue object)
      {
        return createVLSTrueAdapter();
      }
      @Override
      public Adapter caseVLSFalse(VLSFalse object)
      {
        return createVLSFalseAdapter();
      }
      @Override
      public Adapter caseVLSFunction(VLSFunction object)
      {
        return createVLSFunctionAdapter();
      }
      @Override
      public Adapter caseVLSLess(VLSLess object)
      {
        return createVLSLessAdapter();
      }
      @Override
      public Adapter caseVLSInt(VLSInt object)
      {
        return createVLSIntAdapter();
      }
      @Override
      public Adapter caseVLSReal(VLSReal object)
      {
        return createVLSRealAdapter();
      }
      @Override
      public Adapter caseVLSRational(VLSRational object)
      {
        return createVLSRationalAdapter();
      }
      @Override
      public Adapter caseVLSDoubleQuote(VLSDoubleQuote object)
      {
        return createVLSDoubleQuoteAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireModel <em>Vampire Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireModel
   * @generated
   */
  public Adapter createVampireModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSComment <em>VLS Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSComment
   * @generated
   */
  public Adapter createVLSCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFofFormula <em>VLS Fof Formula</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFofFormula
   * @generated
   */
  public Adapter createVLSFofFormulaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSAnnotation <em>VLS Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSAnnotation
   * @generated
   */
  public Adapter createVLSAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm <em>VLS Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm
   * @generated
   */
  public Adapter createVLSTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFunctionFof <em>VLS Function Fof</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFunctionFof
   * @generated
   */
  public Adapter createVLSFunctionFofAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSDefinedTerm <em>VLS Defined Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSDefinedTerm
   * @generated
   */
  public Adapter createVLSDefinedTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSEquivalent <em>VLS Equivalent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSEquivalent
   * @generated
   */
  public Adapter createVLSEquivalentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSImplies <em>VLS Implies</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSImplies
   * @generated
   */
  public Adapter createVLSImpliesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSRevImplies <em>VLS Rev Implies</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSRevImplies
   * @generated
   */
  public Adapter createVLSRevImpliesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSXnor <em>VLS Xnor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSXnor
   * @generated
   */
  public Adapter createVLSXnorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSNor <em>VLS Nor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSNor
   * @generated
   */
  public Adapter createVLSNorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSNand <em>VLS Nand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSNand
   * @generated
   */
  public Adapter createVLSNandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSAnd <em>VLS And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSAnd
   * @generated
   */
  public Adapter createVLSAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSOr <em>VLS Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSOr
   * @generated
   */
  public Adapter createVLSOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSUniversalQuantifier <em>VLS Universal Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSUniversalQuantifier
   * @generated
   */
  public Adapter createVLSUniversalQuantifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSExistentialQuantifier <em>VLS Existential Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSExistentialQuantifier
   * @generated
   */
  public Adapter createVLSExistentialQuantifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSUnaryNegation <em>VLS Unary Negation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSUnaryNegation
   * @generated
   */
  public Adapter createVLSUnaryNegationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSInequality <em>VLS Inequality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSInequality
   * @generated
   */
  public Adapter createVLSInequalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSEquality <em>VLS Equality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSEquality
   * @generated
   */
  public Adapter createVLSEqualityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSAssignment <em>VLS Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSAssignment
   * @generated
   */
  public Adapter createVLSAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSConstant <em>VLS Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSConstant
   * @generated
   */
  public Adapter createVLSConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTrue <em>VLS True</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTrue
   * @generated
   */
  public Adapter createVLSTrueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFalse <em>VLS False</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFalse
   * @generated
   */
  public Adapter createVLSFalseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFunction <em>VLS Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFunction
   * @generated
   */
  public Adapter createVLSFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSLess <em>VLS Less</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSLess
   * @generated
   */
  public Adapter createVLSLessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSInt <em>VLS Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSInt
   * @generated
   */
  public Adapter createVLSIntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSReal <em>VLS Real</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSReal
   * @generated
   */
  public Adapter createVLSRealAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSRational <em>VLS Rational</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSRational
   * @generated
   */
  public Adapter createVLSRationalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSDoubleQuote <em>VLS Double Quote</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSDoubleQuote
   * @generated
   */
  public Adapter createVLSDoubleQuoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //VampireLanguageAdapterFactory