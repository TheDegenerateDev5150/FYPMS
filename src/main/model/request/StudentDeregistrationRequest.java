package main.model.request;

import java.util.Map;

/**
 * A request for a student to deregister from a project
 */
public class StudentDeregistrationRequest implements Request {
    /**
     * The type of the request
     */
    private final RequestType requestType = RequestType.STUDENT_DEREGISTRATION;
    /**
     * The ID of the request
     */
    public String requestID;
    /**
     * The status of the request
     */
    private RequestStatus requestStatus = RequestStatus.PENDING;
    /**
     * The ID of the student
     */
    private String studentID;
    /**
     * The ID of the supervisor
     */
    private String supervisorID;
    /**
     * The ID of the project
     */
    private String projectID;
    /**
     * The ID of the coordinator who deals with the request
     */
    private String coordinatorID = null;

    /**
     * Constructor
     *
     * @param requestID    The ID of the request
     * @param studentID    The ID of the student
     * @param supervisorID The ID of the supervisor
     * @param projectID    The ID of the project
     */
    public StudentDeregistrationRequest(String requestID, String studentID, String supervisorID, String projectID) {
        this.requestID = requestID;
        this.studentID = studentID;
        this.supervisorID = supervisorID;
        this.projectID = projectID;
    }

    /**
     * Constructor
     *
     * @param map The map of the request
     */
    public StudentDeregistrationRequest(Map<String, String> map) {
        fromMap(map);
    }

    /**
     * Get the ID of the student.
     *
     * @return the ID of the student.
     */
    @Override
    public String getStudentID() {
        return studentID;
    }

    /**
     * Get the ID of the supervisor.
     *
     * @return the ID of the supervisor.
     */
    public String getSupervisorID() {
        return supervisorID;
    }

    /**
     * Get the project ID of the request.
     *
     * @return the project ID of the request.
     */
    public String getProjectID() {
        return projectID;
    }

    /**
     * Get the request type.
     *
     * @return the request type.
     */
    @Override
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Get the ID of the coordinator who deals with the request.
     *
     * @return the ID of the coordinator who deals with the request.
     */
    public String getCoordinatorID() {
        return coordinatorID;
    }

    /**
     * Set the ID of the coordinator who deals with the request.
     *
     * @param coordinatorID the ID of the coordinator who deals with the request.
     */
    public void setCoordinatorID(String coordinatorID) {
        this.coordinatorID = coordinatorID;
    }

    /**
     * Get the ID of the request.
     */
    @Override
    public String getID() {
        return requestID;
    }

    /**
     * Get the status of the request.
     *
     * @return the status of the request.
     */
    @Override
    public RequestStatus getStatus() {
        return requestStatus;
    }

    /**
     * Set the status of the request.
     *
     * @param status the status of the request.
     */
    @Override
    public void setStatus(RequestStatus status) {
        this.requestStatus = status;
    }

    /**
     This method returns a formatted string representation of the request's information.
     @return a string with all request information formatted in a table
     */
    @Override
    public String getDisplayableString() {
        return String.format("| %-18s | %-27s |\n", "Request ID", requestID) +
                String.format("| %-18s | %-27s |\n", "Request Type", requestType) +
                String.format("| %-18s | %-36s |\n", "Request Status", requestStatus.showColorfulStatus()) +
                String.format("| %-18s | %-27s |\n", "Project ID", projectID) +
                String.format("| %-18s | %-27s |\n", "Supervisor ID", supervisorID) +
                String.format("| %-18s | %-27s |\n", "Student ID", studentID);
    }
}
