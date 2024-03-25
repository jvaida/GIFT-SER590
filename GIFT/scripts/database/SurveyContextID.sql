-- SQL Query to select relevant survey information based on survey context id
-- To use, copy query and paste it in the SQL tab of the SQuirreL SQL client
-- or any other SQL client you are using.
-- Change the last line "WHERE SC.SURVEYCONTEXTID_FK = ..." to equal the id of
-- the survey context id you want to look up.

-- Select relevant survey information based on survey context id
SELECT  SC.SURVEYCONTEXTID_FK, SC.SURVEYID_FK, SP.SURVEYPAGEID_PK, SP.NAME, SP.PAGENUMBER, Q.QUESTIONID_PK, Q.TEXT, QE.USERNAME AS "QuestionEditableTo", QV.USERNAME AS "QuestionVisibleTo", SCE.USERNAME AS "SurveyContextEditableTo", SCV.USERNAME AS "SurveyContextVisibleTo", SV.USERNAME AS "SurveyVisibleTo"
FROM    APP.SURVEYCONTEXTSURVEY AS SC
JOIN    APP.SURVEYPAGE AS SP
        ON SP.SURVEYID_FK = SC.SURVEYID_FK
JOIN    APP.SURVEYELEMENT AS SE
        ON SE.SURVEYPAGEID_FK = SP.SURVEYPAGEID_PK
JOIN    APP.QUESTION AS Q
        ON SE.QUESTIONID_FK = Q.QUESTIONID_PK
LEFT JOIN    APP.QUESTIONEDITABLETOUSERNAMES AS QE
        ON QE.DBQUESTION_QUESTIONID_PK = Q.QUESTIONID_PK
LEFT JOIN    APP.QUESTIONVISIBLETOUSERNAMES AS QV
        ON QV.DBQUESTION_QUESTIONID_PK = Q.QUESTIONID_PK
LEFT JOIN    APP.SURVEYCONTEXTEDITABLETOUSERNAMES AS SCE
        ON SCE.DBSURVEYCONTEXT_SURVEYCONTEXTID_PK = SC.SURVEYCONTEXTID_FK
LEFT JOIN    APP.SURVEYCONTEXTVISIBLETOUSERNAMES AS SCV
        ON SCV.DBSURVEYCONTEXT_SURVEYCONTEXTID_PK = SC.SURVEYCONTEXTID_FK
LEFT JOIN    APP.SURVEYVISIBLETOUSERNAMES AS SV
        ON SV.DBSURVEY_SURVEYID_PK = SP.SURVEYID_FK
WHERE   SC.SURVEYCONTEXTID_FK = 6