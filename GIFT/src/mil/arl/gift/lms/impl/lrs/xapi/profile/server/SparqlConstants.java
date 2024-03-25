package mil.arl.gift.lms.impl.lrs.xapi.profile.server;

import mil.arl.gift.lms.impl.lrs.LrsEnum;

/**
 * Aliases and field names used within xAPI Profile SPARQL queries.
 * 
 * @author Yet Analytics
 *
 */
public enum SparqlConstants implements LrsEnum {
    VARIABLE_PREFIX("?"),
    NAME("name"),
    DESCRIPTION("description"),
    MORE_INFO("moreInfo"),
    INTERACTION_TYPE("interactionType"),
    EXTENSIONS("extensions"),
    CORRECT_RESPONSE_PATTERN("correctResponsesPattern"),
    CHOICES("choices"),
    SCALE("scale"),
    SOURCE("source"),
    TARGET("target"),
    STEPS("steps"),
    INSCHEME("inScheme"),
    PREFLABEL("prefLabel"),
    DEFINITION("definition"),
    DEPRECATED("deprecated"),
    TYPE("type"),
    BROADER("broader"),
    BROAD_MATCH("broadMatch"),
    NARROWER("narrower"),
    NARROW_MATCH("narrowMatch"),
    RELATED("related"),
    RELATED_MATCH("relatedMatch"),
    EXACT_MATCH("exactMatch"),
    ACTIVITY_DEFINITION("activityDefinition"),
    ACTIVITY_DESCRIPTION("activityDescription"),
    ACTIVITY_NAME("activityName"),
    ACTIVITY_TYPE("activityType"),
    ACTIVITY_MORE_INFO("activityMoreInfo"),
    ACTIVITY_EXTENSIONS("activityExtensions"),
    ACTIVITY_INTERACTION_TYPE("activityInteractionType"),
    ACTIVITY_CORRECT_RESPONSE_PATTERN("activityCorrectResponsePattern"),
    ACTIVITY_CHOICES("activityChoices"),
    ACTIVITY_SCALE("activityScale"),
    ACTIVITY_SOURCE("activitySource"),
    ACTIVITY_TARGET("activityTarget"),
    ACTIVITY_STEPS("activitySteps"),
    RECOMMENDED_ACTIVITY_TYPES("recommendedActivityTypes"),
    RECOMMENDED_VERBS("recommendedVerbs"),
    CONTEXT("context"),
    SCHEMA("schema"),
    INLINE_SCHEMA("inlineSchema"),
    CONTENT_TYPE("contentType"),
    VERB("verb"),
    OBJECT_ACTIVITY_TYPE("objectActivityType"),
    CONTEXT_GROUPING_ACTIVITY_TYPE("contextGroupingActivityType"),
    CONTEXT_PARENT_ACTIVITY_TYPE("contextParentActivityType"),
    CONTEXT_OTHER_ACTIVITY_TYPE("contextOtherActivityType"),
    CONTEXT_CATEGORY_ACTIVITY_TYPE("contextCategoryActivityType"),
    ATTACHMENT_USAGE_TYPE("attachmentUsageType"),
    OBJECT_STATEMENT_REF_TEMPLATE("objectStatementRefTemplate"),
    CONTEXT_STATEMENT_REF_TEMPLATE("contextStatementRefTemplate"),
    PRIMARY("primary"),
    ALTERNATES("alternates"),
    OPTIONAL("optional"),
    ONE_OR_MORE("oneOrMore"),
    SEQUENCE("sequence"),
    ZERO_OR_MORE("zeroOrMore"),
    PROFILE_DEPRECATED("profile:deprecated"),
    PROFILE_TYPE("a"),
    PROFILE_CONTEXT("profile:context"),
    PROFILE_RECOMMENDED_ACTIVITY_TYPES("profile:recommendedActivityTypes"),
    PROFILE_RECOMMENDED_VERBS("profile:recommendedVerbs"),
    PROFILE_SCHEMA("profile:schema"),
    PROFILE_INLINE_SCHEMA("profile:inlineSchema"),
    PROFILE_CONTENT_TYPE("profile:contentType"),
    PROFILE_VERB("profile:verb"),
    PROFILE_OBJECT_ACTIVITY_TYPE("profile:objectActivityType"),
    PROFILE_CONTEXT_GROUPING_ACTIVITY_TYPE("profile:contextGroupingActivityType"),
    PROFILE_CONTEXT_PARENT_ACTIVITY_TYPE("profile:contextParentActivityType"),
    PROFILE_CONTEXT_OTHER_ACTIVITY_TYPE("profile:contextOtherActivityType"),
    PROFILE_CONTEXT_CATEGORY_ACTIVITY_TYPE("profile:contextCategoryActivityType"),
    PROFILE_ATTACHMENT_USAGE_TYPE("profile:attachmentUsageType"),
    PROFILE_OBJECT_STATEMENT_REF_TEMPLATE("profile:objectStatementRefTemplate"),
    PROFILE_CONTEXT_STATEMENT_REF_TEMPLATE("profile:contextStatementRefTemplate"),
    PROFILE_ACTIVITY_DEFINITION("profile:activityDefinition"),
    PROFILE_PRIMARY("profile:primary"),
    PROFILE_ALTERNATES("profile:alternates"),
    PROFILE_OPTIONAL("profile:optional"),
    PROFILE_ONE_OR_MORE("profile:oneOrMore"),
    PROFILE_SEQUENCE("profile:sequence"),
    PROFILE_ZERO_OR_MORE("profile:zeroOrMore"),
    XAPI_ACTIVITY_DESCRIPTION("xapi:description"),
    XAPI_ACTIVITY_NAME("xapi:name"),
    XAPI_ACTIVITY_TYPE("xapi:type"),
    XAPI_ACTIVITY_MORE_INFO("xapi:moreInfo"),
    XAPI_ACTIVITY_EXTENSIONS("xapi:extensions"),
    XAPI_ACTIVITY_INTERACTION_TYPE("xapi:interactionType"),
    XAPI_ACTIVITY_CORRECT_RESPONSE_PATTERN("xapi:correctResponsesPattern"),
    XAPI_ACTIVITY_CHOICES("xapi:choices"),
    XAPI_ACTIVITY_SCALE("xapi:scale"),
    XAPI_ACTIVITY_SOURCE("xapi:source"),
    XAPI_ACTIVITY_TARGET("xapi:target"),
    XAPI_ACTIVITY_STEPS("xapi:steps"),
    SKOS_PREFLABEL("skos:prefLabel"),
    SKOS_DEFINITION("skos:definition"),
    SKOS_INSCHEME("skos:inScheme"),
    SKOS_BROADER("skos:broader"),
    SKOS_BROAD_MATCH("skos:broadMatch"),
    SKOS_NARROWER("skos:narrower"),
    SKOS_NARROW_MATCH("skos:narrowMatch"),
    SKOS_RELATED("skos:related"),
    SKOS_RELATED_MATCH("skos:relatedMatch"),
    SKOS_EXACT_MATCH("skos:exactMatch");
    // Construction
    private String value;
    SparqlConstants(String s) throws IllegalArgumentException {
        this.value = s;
    }
    @Override
    public String getValue() {
        return value;
    }
}