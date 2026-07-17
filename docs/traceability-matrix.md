# Requirements Traceability Matrix

This table shows how each user story connects to a requirement, an
acceptance test, and the Java code that supports it. It provides a clear
trace from the backlog to the implementation and keeps the submission
auditable.

| Story ID | User Story                 | Requirement ID | Acceptance Test ID | Code Module              | MoSCoW Priority           | Status      |
|----------|----------------------------|----------------|---------------------|--------------------------|---------------------------|-------------|
| US-01    | Sales Rep Login            | REQ-01         | AC-01               | `BacklogDemo.java`        | Must Have                | Implemented |
| US-02    | View Sales Pipeline        | REQ-02         | AC-02               | `BacklogDemo.java`        | Must Have                | Implemented |
| US-03    | Download Sales Report      | REQ-03         | AC-03               | `BacklogDemo.java`        | Should Have              | Implemented |
| US-04    | Dark Mode Toggle           | REQ-04         | AC-04               | `BacklogDemo.java`        | Could Have               | Implemented |
| US-05    | SMS Follow-Up Reminder     | REQ-05         | AC-05               | `BacklogDemo.java`        | Won't Have (this release)| Implemented |

## How to read this matrix
- **Story ID** matches the ID used in `backlog.md`.
- **Requirement ID** is the formal requirement this story satisfies (used again in `SRS.md`).
- **Acceptance Test ID** matches the Given-When-Then scenario for that story.
- **Code Module** is the actual class/file that implements the story (matches your Java code or team project code).
- **Status** should be updated honestly as work progresses: Planned, In Progress, Implemented, or Deferred.

