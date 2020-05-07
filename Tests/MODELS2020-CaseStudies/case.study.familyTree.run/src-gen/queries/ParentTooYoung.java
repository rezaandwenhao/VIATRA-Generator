/**
 * Generated from platform:/resource/case.study.familyTree.run/src/queries/familyTreeConstraints.vql
 */
package queries;

import familytree.Member;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         {@literal @}Constraint(message="parentTooYoung", severity="error", key={m, p})
 *         pattern parentTooYoung(m: Member, p: Member) = {
 *         	FamilyTree.members(_, m);
 *         	Member.parents(m, p);
 *         	Member.age(m, mAge);
 *         	Member.age(p, pAge);
 *         	check (mAge {@literal <}= (pAge + 12));
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ParentTooYoung extends BaseGeneratedEMFQuerySpecification<ParentTooYoung.Matcher> {
  /**
   * Pattern-specific match representation of the queries.parentTooYoung pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private Member fM;
    
    private Member fP;
    
    private static List<String> parameterNames = makeImmutableList("m", "p");
    
    private Match(final Member pM, final Member pP) {
      this.fM = pM;
      this.fP = pP;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "m": return this.fM;
          case "p": return this.fP;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fM;
          case 1: return this.fP;
          default: return null;
      }
    }
    
    public Member getM() {
      return this.fM;
    }
    
    public Member getP() {
      return this.fP;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("m".equals(parameterName) ) {
          this.fM = (Member) newValue;
          return true;
      }
      if ("p".equals(parameterName) ) {
          this.fP = (Member) newValue;
          return true;
      }
      return false;
    }
    
    public void setM(final Member pM) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fM = pM;
    }
    
    public void setP(final Member pP) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fP = pP;
    }
    
    @Override
    public String patternName() {
      return "queries.parentTooYoung";
    }
    
    @Override
    public List<String> parameterNames() {
      return ParentTooYoung.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fM, fP};
    }
    
    @Override
    public ParentTooYoung.Match toImmutable() {
      return isMutable() ? newMatch(fM, fP) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"m\"=" + prettyPrintValue(fM) + ", ");
      result.append("\"p\"=" + prettyPrintValue(fP));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fM, fP);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ParentTooYoung.Match)) {
          ParentTooYoung.Match other = (ParentTooYoung.Match) obj;
          return Objects.equals(fM, other.fM) && Objects.equals(fP, other.fP);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public ParentTooYoung specification() {
      return ParentTooYoung.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ParentTooYoung.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pM the fixed value of pattern parameter m, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ParentTooYoung.Match newMutableMatch(final Member pM, final Member pP) {
      return new Mutable(pM, pP);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pM the fixed value of pattern parameter m, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ParentTooYoung.Match newMatch(final Member pM, final Member pP) {
      return new Immutable(pM, pP);
    }
    
    private static final class Mutable extends ParentTooYoung.Match {
      Mutable(final Member pM, final Member pP) {
        super(pM, pP);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ParentTooYoung.Match {
      Immutable(final Member pM, final Member pP) {
        super(pM, pP);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.parentTooYoung pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(message="parentTooYoung", severity="error", key={m, p})
   * pattern parentTooYoung(m: Member, p: Member) = {
   * 	FamilyTree.members(_, m);
   * 	Member.parents(m, p);
   * 	Member.age(m, mAge);
   * 	Member.age(p, pAge);
   * 	check (mAge {@literal <}= (pAge + 12));
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ParentTooYoung
   * 
   */
  public static class Matcher extends BaseMatcher<ParentTooYoung.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ParentTooYoung.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static ParentTooYoung.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_M = 0;
    
    private static final int POSITION_P = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ParentTooYoung.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pM the fixed value of pattern parameter m, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ParentTooYoung.Match> getAllMatches(final Member pM, final Member pP) {
      return rawStreamAllMatches(new Object[]{pM, pP}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pM the fixed value of pattern parameter m, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ParentTooYoung.Match> streamAllMatches(final Member pM, final Member pP) {
      return rawStreamAllMatches(new Object[]{pM, pP});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pM the fixed value of pattern parameter m, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ParentTooYoung.Match> getOneArbitraryMatch(final Member pM, final Member pP) {
      return rawGetOneArbitraryMatch(new Object[]{pM, pP});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pM the fixed value of pattern parameter m, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Member pM, final Member pP) {
      return rawHasMatch(new Object[]{pM, pP});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pM the fixed value of pattern parameter m, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Member pM, final Member pP) {
      return rawCountMatches(new Object[]{pM, pP});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pM the fixed value of pattern parameter m, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Member pM, final Member pP, final Consumer<? super ParentTooYoung.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pM, pP}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pM the fixed value of pattern parameter m, or null if not bound.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ParentTooYoung.Match newMatch(final Member pM, final Member pP) {
      return ParentTooYoung.Match.newMatch(pM, pP);
    }
    
    /**
     * Retrieve the set of values that occur in matches for m.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Member> rawStreamAllValuesOfm(final Object[] parameters) {
      return rawStreamAllValues(POSITION_M, parameters).map(Member.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for m.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Member> getAllValuesOfm() {
      return rawStreamAllValuesOfm(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for m.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Member> streamAllValuesOfm() {
      return rawStreamAllValuesOfm(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for m.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Member> streamAllValuesOfm(final ParentTooYoung.Match partialMatch) {
      return rawStreamAllValuesOfm(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for m.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Member> streamAllValuesOfm(final Member pP) {
      return rawStreamAllValuesOfm(new Object[]{null, pP});
    }
    
    /**
     * Retrieve the set of values that occur in matches for m.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Member> getAllValuesOfm(final ParentTooYoung.Match partialMatch) {
      return rawStreamAllValuesOfm(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for m.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Member> getAllValuesOfm(final Member pP) {
      return rawStreamAllValuesOfm(new Object[]{null, pP}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Member> rawStreamAllValuesOfp(final Object[] parameters) {
      return rawStreamAllValues(POSITION_P, parameters).map(Member.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Member> getAllValuesOfp() {
      return rawStreamAllValuesOfp(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Member> streamAllValuesOfp() {
      return rawStreamAllValuesOfp(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Member> streamAllValuesOfp(final ParentTooYoung.Match partialMatch) {
      return rawStreamAllValuesOfp(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Member> streamAllValuesOfp(final Member pM) {
      return rawStreamAllValuesOfp(new Object[]{pM, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Member> getAllValuesOfp(final ParentTooYoung.Match partialMatch) {
      return rawStreamAllValuesOfp(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Member> getAllValuesOfp(final Member pM) {
      return rawStreamAllValuesOfp(new Object[]{pM, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ParentTooYoung.Match tupleToMatch(final Tuple t) {
      try {
          return ParentTooYoung.Match.newMatch((Member) t.get(POSITION_M), (Member) t.get(POSITION_P));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ParentTooYoung.Match arrayToMatch(final Object[] match) {
      try {
          return ParentTooYoung.Match.newMatch((Member) match[POSITION_M], (Member) match[POSITION_P]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ParentTooYoung.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ParentTooYoung.Match.newMutableMatch((Member) match[POSITION_M], (Member) match[POSITION_P]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<ParentTooYoung.Matcher> querySpecification() {
      return ParentTooYoung.instance();
    }
  }
  
  private ParentTooYoung() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ParentTooYoung instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ParentTooYoung.Matcher instantiate(final ViatraQueryEngine engine) {
    return ParentTooYoung.Matcher.on(engine);
  }
  
  @Override
  public ParentTooYoung.Matcher instantiate() {
    return ParentTooYoung.Matcher.create();
  }
  
  @Override
  public ParentTooYoung.Match newEmptyMatch() {
    return ParentTooYoung.Match.newEmptyMatch();
  }
  
  @Override
  public ParentTooYoung.Match newMatch(final Object... parameters) {
    return ParentTooYoung.Match.newMatch((familytree.Member) parameters[0], (familytree.Member) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ParentTooYoung} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ParentTooYoung#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ParentTooYoung INSTANCE = new ParentTooYoung();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final ParentTooYoung.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_m = new PParameter("m", "familytree.Member", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/familytree", "Member")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p = new PParameter("p", "familytree.Member", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/familytree", "Member")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_m, parameter_p);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.parentTooYoung";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("m","p");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_m = body.getOrCreateVariableByName("m");
          PVariable var_p = body.getOrCreateVariableByName("p");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_mAge = body.getOrCreateVariableByName("mAge");
          PVariable var_pAge = body.getOrCreateVariableByName("pAge");
          new TypeConstraint(body, Tuples.flatTupleOf(var_m), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/familytree", "Member")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/familytree", "Member")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_m, parameter_m),
             new ExportedParameter(body, var_p, parameter_p)
          ));
          // 	FamilyTree.members(_, m)
          new TypeConstraint(body, Tuples.flatTupleOf(var___0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/familytree", "FamilyTree")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var___0_, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/familytree", "FamilyTree", "members")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/familytree", "Member")));
          new Equality(body, var__virtual_0_, var_m);
          // 	Member.parents(m, p)
          new TypeConstraint(body, Tuples.flatTupleOf(var_m), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/familytree", "Member")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_m, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/familytree", "Member", "parents")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/familytree", "Member")));
          new Equality(body, var__virtual_1_, var_p);
          // 	Member.age(m, mAge)
          new TypeConstraint(body, Tuples.flatTupleOf(var_m), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/familytree", "Member")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_m, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/familytree", "Member", "age")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_2_, var_mAge);
          // 	Member.age(p, pAge)
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/familytree", "Member")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/familytree", "Member", "age")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_3_, var_pAge);
          // 	check (mAge <= (pAge + 12))
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern parentTooYoung";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("mAge", "pAge");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer mAge = (Integer) provider.getValue("mAge");
                  Integer pAge = (Integer) provider.getValue("pAge");
                  return evaluateExpression_1_1(mAge, pAge);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("message", "parentTooYoung");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("m"), 
                              new ParameterReference("p")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer mAge, final Integer pAge) {
    return ((mAge).intValue() <= ((pAge).intValue() + 12));
  }
}
