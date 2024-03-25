/**
 * Copyright Dignitas Technologies, LLC
 * 
 * This file and its contents are governed by one or more distribution and
 * copyright statements as described in the LICENSE.txt file distributed with
 * this work.
 */
package mil.arl.gift.common.experiment;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

import mil.arl.gift.common.experiment.ExperimentUtil.DataCollectionUserRole;
import mil.arl.gift.common.experiment.ExperimentUtil.DataSetType;
import mil.arl.gift.common.experiment.ExperimentUtil.ExperimentStatus;
import mil.arl.gift.common.util.StringUtils;

/**
 * An RPC-safe and client-safe representation of a DataCollection object. This class exists to deal with common cases where
 * mil.arl.gift.ums.db.table.DbDataCollection cannot be used, such as in the Javascript generated by GWT for web clients
 * or in remote procedure calls made between web clients and servers.
 *
 * @author nroberts
 */
public class DataCollectionItem implements Serializable {

    /** The version number used for serialization logic */
    private static final long serialVersionUID = 1L;

    /** The experiment's ID */
    private String id;

    /** The experiment's name*/
    private String name;

    /** The experiment's description*/
    private String description;

    /** the GIFT username of the author of the experiment */
    private String authorUsername;

    /** The experiment's status*/
    private ExperimentStatus status;

    /** The type of data collection data set (experiment, lti, etc.) */
    private DataSetType dataSetType;

    /** The source course id (optional, depends on the data set type) */
    private String sourceCourseId;

    /**
     * the url given to participants to take the experiment, i.e. run the course
     */
    private String url;

    /**
     * the location of the course folder that contains the course.xml file for
     * the user to run this experiment instance
     */
    private String courseFolder;

    /* The following size and last attempted fields depend on the 'type' of experiment. If an
     * 'experiment' type, then the data collection results are stored in the subjects fields. If an
     * 'lti' type, then the results are stored in the ltiResults fields. */

    /**
     * The number of the experiment's subjects - this is the data collection results if the experiment is an experiment type.
     */
    private long subjectSize = 0;

    /**
     * The latest timestamp for one of the experiment subjects taking the course.
     */
    private Date subjectLastAttemptedDate;

    /**
     * The number of data collection results if the data collection is an LTI type.
     */
    private long ltiResultSize = 0;

    /**
     * The latest timestamp for the LTI results.
     */
    private Date ltiResultLastAttemptedDate;
    
    /**
     * The published date timestamp for this course
     */
    private Date publishedDate = null;

    /**
     * the collection of permissions for this data collection item.  Can be null or empty
     * when this object was created prior to permissions existing.
     */
    private Set<DataCollectionPermission> permissions;

    /**
     * A public, default, no-argument constructor required to send this object through remote procedure calls
     */
    public DataCollectionItem(){

    }

    /**
     * Creates a new experiment with the given attributes
     *
     * @param id the experiment's ID
     * @param authorUsername the name of the user who authored the experiment. Cannot be null.
     * @param name the experiment's name. Cannot be null.
     * @param description the experiment's description
     * @param url the URL used to access the experiment. Cannot be null.
     * @param courseFolder the experiment's course folder. Cannot be null.
     * @param status the experiment's status. Cannot be null.
     * @param subjectSize the size of the experiment subjects (which is the data collection set for the experiment if it is an experiment type). Cannot be negative.
     * @param subjectLastAttemptedDate the date of the last attempt of an experiment subject. Can be null if there are no subjects; cannot be null if subject size is > 0.
     * @param ltiResultSize the size of the experiment LTI results (which is the data collection set for the experiment if it is an LTI type). Cannot be negative.
     * @param ltiResultLastAttemptedDate the date of the last attempt of an experiment LTI. Can be null if there are no LTI results; cannot be null if LTI result size is > 0.
     * @param dataSetType the experiment's data collection type (experiment, lti).  Cannot be null.
     * @param sourceCourseId the UUID of the source course folder.  Can be null.
     * @param publishedDate the published date of the experiment. Can be null only when working with a legacy experiment (experiments created before work on #5123 in January 2022).
     * @throws IllegalArgumentException if any of the passed parameters are null
     */
    public DataCollectionItem(String id, String authorUsername, String name, String description, String url, String courseFolder,
            ExperimentStatus status, long subjectSize, Date subjectLastAttemptedDate, long ltiResultSize, Date ltiResultLastAttemptedDate,
            DataSetType dataSetType, String sourceCourseId, Date publishedDate) throws IllegalArgumentException{

        if(id == null){
            throw new IllegalArgumentException("The experiment ID cannot be null.");
        }

        if(authorUsername == null){
            throw new IllegalArgumentException("The experiment author username cannot be null.");
        }

        if(name == null){
            throw new IllegalArgumentException("The experiment name cannot be null.");
        }

        if(url == null){
            throw new IllegalArgumentException("The experiment URL cannot be null.");
        }

        if(courseFolder == null){
            throw new IllegalArgumentException("The experiment course folder cannot be null.");
        }

        if(status == null){
            throw new IllegalArgumentException("The experiment status cannot be null.");
        }

        if (subjectSize < 0) {
            throw new IllegalArgumentException("The experiment subject size cannot be less than zero.");
        }

        if (subjectSize != 0 && subjectLastAttemptedDate == null) {
            throw new IllegalArgumentException("The experiment subject last attempted date cannot be null since there are subjects.");
        }

        if (ltiResultSize < 0) {
            throw new IllegalArgumentException("The experiment subject size cannot be less than zero.");
        }

        if (ltiResultSize != 0 && ltiResultLastAttemptedDate == null) {
            throw new IllegalArgumentException("The experiment subject last attempted date cannot be null since there are subjects.");
        }

        if(dataSetType == null){
            throw new IllegalArgumentException("The data set type cannot be null.");
        }


        this.id = id;
        this.authorUsername = authorUsername;
        this.name = name;
        this.description = description;
        this.url = url;
        this.courseFolder = courseFolder;
        this.status = status;
        this.subjectSize = subjectSize;
        this.subjectLastAttemptedDate = subjectLastAttemptedDate;
        this.ltiResultSize = ltiResultSize;
        this.ltiResultLastAttemptedDate = ltiResultLastAttemptedDate;
        this.dataSetType = dataSetType;
        // sourceCourseId and publishedDate can be null.
        this.sourceCourseId = sourceCourseId;
        setPublishedDate(publishedDate);
    }

    /**
     * Sets the experiment's ID. The value passed in cannot be null.
     *
     * @param experimentId the experiment's ID
     */
    public void setId(String experimentId) {

        if(id == null){
            throw new IllegalArgumentException("The experiment ID cannot be null.");
        }

        this.id = experimentId;
    }

    /**
     * Gets the experiment's ID
     *
     * @return the experiment's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the username of this experiment's author
     *
     * @return the username of this experiment's author
     */
    public String getAuthorUsername() {
        return authorUsername;
    }

    /**
     * Sets the username of this experiment's author. The value passed in cannot be null.
     *
     * @param authorUsername the username of this experiment's author
     */
    public void setAuthorUsername(String authorUsername) {

        if(authorUsername == null){
            throw new IllegalArgumentException("The experiment author username cannot be null.");
        }

        this.authorUsername = authorUsername;
    }

    /**
     * Gets the experiment's status
     *
     * @return the experiment's status
     */
    public ExperimentStatus getStatus() {
        return status;
    }

    /**
     * Sets the experiment's status. The value passed in cannot be null.
     *
     * @param status the experiment's status
     */
    public void setStatus(ExperimentStatus status) {

        if(status == null){
            throw new IllegalArgumentException("The experiment status cannot be null.");
        }

        this.status = status;
    }

    /**
     * Gets the experiment's course folder
     *
     * @return the experiment's course folder
     */
    public String getCourseFolder() {
        return courseFolder;
    }

    /**
     * Sets the experiment's course folder. The value passed in cannot be null.
     *
     * @param experimentCourseFolder the experiment's course folder
     */
    public void setCourseFolder(String experimentCourseFolder) {

        if(courseFolder == null){
            throw new IllegalArgumentException("The experiment course folder cannot be null.");
        }

        this.courseFolder = experimentCourseFolder;
    }

    /**
     * Gets the experiment's name
     *
     * @return the experiment's name
     */
    public String getName() {

        return name;
    }

    /**
     * Sets the experiment's name. The value passed in cannot be null.
     *
     * @param name the experiment's name
     */
    public void setName(String name) {

        if(name == null){
            throw new IllegalArgumentException("The experiment name cannot be null.");
        }

        this.name = name;
    }

    /**
     * Gets the experiment's description
     *
     * @return the experiment's description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the experiment's description
     *
     * @param description the experiment's description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the experiment's URL
     *
     * @return the experiment's URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the experiment's URL. The value passed in cannot be null.
     *
     * @param url the experiment's URL
     */
    public void setUrl(String url) {

        if(url == null){
            throw new IllegalArgumentException("The experiment URL cannot be null.");
        }

        this.url = url;
    }

    /**
     * Retrieves the count of the experiment's subjects.
     *
     * @return the total number of subjects that the experiment has had.
     */
    public long getSubjectSize() {
        return subjectSize;
    }

    /**
     * The date of the most recent attempt at the experiment via a subject.
     *
     * @return the date of the latest attempt. Can't be null if the subject size > 0.
     */
    public Date getSubjectLastAttemptedDate() {
        return subjectLastAttemptedDate;
    }

    /**
     * Retrieves the count of the experiment's LTI results.
     *
     * @return the total number of LTI results that the experiment has had.
     */
    public long getLtiResultSize() {
        return ltiResultSize;
    }

    /**
     * The date of the most recent attempt at the experiment via LTI.
     *
     * @return the date of the latest attempt. Can't be null if the LTI result size > 0.
     */
    public Date getLtiResultLastAttemptedDate() {
        return ltiResultLastAttemptedDate;
    }

    /**
     * Return the data collection type (e.g. Experiment, LTI)
     *
     * @return the type of data collection
     */
    public DataSetType getDataSetType() {
        return dataSetType;
    }

    /**
     * Set the data collection type (e.g. Experiment, LTI)
     *
     * @param dataSetType the dataSetType to set
     */
    public void setDataSetType(DataSetType dataSetType) {
        this.dataSetType = dataSetType;
    }

    /**
     * Method to determine if the experiment data set type matches the compared type.
     * @param dataSetType the type to compare the experiment data set type with
     * @return true if the experiment data set type matches, false otherwise.
     */
    public boolean isDataSetType(DataSetType dataSetType) {
        return this.dataSetType.compareTo(dataSetType) == 0;
    }


    /**
     * Return the published date of the course that should be ran for this data collection experience
     *
     * @return the published date, can return null if the experiment is a legacy experiment (experiments created before work on #5123 in January 2022).
     */
    public Date getPublishedDate() {
        return publishedDate;
    }

    /**
     * Set the published date of the course that should be ran for this data collection experience
     *
     * @param publishedDate the date to set, can return null if the experiment is a legacy experiment (experiments created before work on #5123 in January 2022).
     */
    private void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
    
    /**
     * Return the id of the course that should be ran for this data collection experience
     *
     * @return the course id
     */
    public String getSourceCourseId() {
        return sourceCourseId;
    }

    /**
     * Set the id of the course that should be ran for this data collection experience
     *
     * @param sourceCourseId the sourceCourseId to set
     */
    public void setSourceCourseId(String sourceCourseId) {
        this.sourceCourseId = sourceCourseId;
    }

    /**
     * Return the collection of permissions for this data collection item.
     *
     * @return Can be null or empty when this object was created prior to permissions existing.
     */
    public Set<DataCollectionPermission> getPermissions() {
        return permissions;
    }

    /**
     * Set the collection of permissions for this data collection item.
     *
     * @param permissions Can be null or empty when this object was created prior to permissions existing.
     */
    public void setPermissions(Set<DataCollectionPermission> permissions) {
        this.permissions = permissions;
    }

    /**
     * Determines the {@link DataCollectionUserRole} that has been assigned for
     * a given user name.
     *
     * @param username The name of the user for whom the
     *        {@link DataCollectionUserRole} should be determined. Cannot be
     *        null or empty.
     * @return The {@link DataCollectionUserRole} that was assigned to the
     *         specified user or null if no role has been specified.
     */
    public DataCollectionUserRole getPermissionForUser(String username) {
        if (StringUtils.isBlank(username)) {
            throw new IllegalArgumentException("The parameter 'username' cannot be blank");
        }

        for (DataCollectionPermission perm : getPermissions()) {
            if (StringUtils.equals(perm.getUsername(), username)) {
                return perm.getDataCollectionUserRole();
            }
        }

        return null;
    }

    /**
     * Checks if the data collection is a legacy experiment.
     *
     * @return true if the data collection is a legacy
     *         {@link DataSetType#EXPERIMENT}.
     */
    public boolean isLegacyExperiment() {
        return DataSetType.EXPERIMENT.equals(getDataSetType()) && StringUtils.isBlank(getSourceCourseId());
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[DataCollectionItem:");
        sb.append(" id = ").append(getId());
        sb.append(", name = ").append(getName());
        sb.append(", dataSetType = ").append(getDataSetType());
        sb.append(", sourceCourseId = ").append(getSourceCourseId());
        sb.append(", legacy = ").append(isLegacyExperiment());
        sb.append(", author = ").append(getAuthorUsername());
        sb.append(", permissions = {");
        if(permissions != null){
            for(DataCollectionPermission permission : permissions){
                sb.append("\n").append(permission);
            }
        }
        sb.append("}");
        sb.append(", status = ").append(getStatus());
        sb.append(", url = ").append(getUrl());
        sb.append(", courseFolder = ").append(getCourseFolder());
        sb.append(", subjectSize = ").append(getSubjectSize());
        sb.append(", subjectLastAttemptDate = ").append(getSubjectLastAttemptedDate());
        sb.append(", ltiResultSize = ").append(getLtiResultSize());
        sb.append(", ltiResultLastAttemptDate = ").append(getLtiResultLastAttemptedDate());
        sb.append(",\n description = ").append(getDescription());
        sb.append(", publishedDate = ").append(getPublishedDate());
        sb.append("]");

        return sb.toString();
    }

    /**
     * Contains permission information for a published course.
     * This is a close copy of the UMS database table (DbDataCollectionPermission).
     *
     * @author mhoffman
     *
     */
    public static class DataCollectionPermission implements Serializable, Comparable<DataCollectionPermission>{

        /**
         * default - auto generated
         */
        private static final long serialVersionUID = 1L;

        /** a unique id of a data collection (e.g. Experiment) among all data collection types (e.g. Experiment, LTI) */
        private String dataCollectionId;

        /** the gift username the permission value is for */
        private String username;

        /** the type of role assigned to this gift user for the data collection row */
        private DataCollectionUserRole role;

        /**
         * Constructor needed for GWT serialization (do not use)
         */
        public DataCollectionPermission(){}

        /**
         * Set attributes.
         *
         * @param dataCollectionId a unique id of a data collection (e.g. Experiment) among all data collection types (e.g. Experiment, LTI).
         * Can't be null or empty.
         * @param username the gift username the permission value is for.  Can't be null or empty.
         * @param role the type of role assigned to this gift user for the data collection row.  Can be null
         * as an indication that the user's permissions should be removed.
         */
        public DataCollectionPermission(String dataCollectionId, String username, DataCollectionUserRole role){
            this.setDataCollectionId(dataCollectionId);
            this.setUsername(username);
            this.updateDataCollectionUserRole(role);
        }

        /**
         * Set a unique id of a data collection (e.g. Experiment) among all data collection types (e.g. Experiment, LTI)
         * @param dataCollectionId the unique id
         */
        private void setDataCollectionId(String dataCollectionId){

            if(StringUtils.isBlank(dataCollectionId)){
                throw new IllegalArgumentException("The data collection id can't be null or empty");
            }
            this.dataCollectionId = dataCollectionId;
        }

        /**
         * Return the unique id of a data collection (e.g. Experiment) among all data collection types (e.g. Experiment, LTI).
         *
         * @return Can't be null or empty.
         */
        public String getDataCollectionId(){
            return dataCollectionId;
        }

        /**
         * Return the gift username the permission value is for.
         *
         * @return Can't be null or empty.
         */
        public String getUsername() {
            return username;
        }

        /**
         * Set the gift username the permission value is for
         * @param username won't be null
         */
        private void setUsername(String username) {

            if(StringUtils.isBlank(username)){
                throw new IllegalArgumentException("The username can't be null");
            }

            /* Always make the user lowercase so it can be used safely with the
             * database and nuxeo */
            this.username = username.toLowerCase().trim();
        }

        /**
         * Return the type of role assigned to this gift user for the data collection row
         *
         * @return can be null to indicate this user's permissions should be deleted
         */
        public DataCollectionUserRole getDataCollectionUserRole() {
            return role;
        }

        /**
         * Set  the type of role assigned to this gift user for the data collection row
         *
         * @param role the new role to set for this user.  Can be null to indicate this user's permissions should be deleted
         */
        public void updateDataCollectionUserRole(DataCollectionUserRole role) {
            this.role = role;
        }
        
        /**
         * Return whether this permission object is for the owner.
         * @return true if the role specified here is the owner role.
         */
        public boolean isOwner(){
            return role != null && DataCollectionUserRole.OWNER.equals(role);
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 53 * hash + Objects.hashCode(this.dataCollectionId);
            hash = 53 * hash + Objects.hashCode(this.username);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {

            if (obj == null) {

                return false;
            }

            if (getClass() != obj.getClass()) {

                return false;
            }

            final DataCollectionPermission other = (DataCollectionPermission) obj;

            if (!StringUtils.equals(this.dataCollectionId, other.getDataCollectionId())) {

                return false;
            }

            if (!StringUtils.equals(this.username, other.getUsername())) {

                return false;
            }

            return true;
        }


        @Override
        public int compareTo(DataCollectionPermission other) {
            
            if(other == null){
                return -1;
            }

            /* Overriding compareTo to group DbDataCollectionPermissions by their user roles, and then sorting by username within each group.
             * The user role groupings will be sorted based on the order they were declared in DataCollectionUserRole. */
             DataCollectionUserRole thisUserRole = this.getDataCollectionUserRole();
             DataCollectionUserRole otherUserRole = other.getDataCollectionUserRole();
             if (thisUserRole != null && otherUserRole != null && thisUserRole != otherUserRole){
                 // enum's compareTo method uses the order the objects are declared as their natural order.
                 return thisUserRole.compareTo(otherUserRole);
             }

            return this.getUsername().compareTo(other.getUsername());
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("[DataCollectionPermission: dataCollection = ");
            builder.append(dataCollectionId);
            builder.append(", username = ");
            builder.append(username);
            builder.append(", role = ");
            builder.append(role);
            builder.append("]");
            return builder.toString();
        }
    }
}
