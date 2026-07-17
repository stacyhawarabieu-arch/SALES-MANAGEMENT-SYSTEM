# Non-Functional Requirements (NFRs)

Non-functional requirements describe **how well** the system must perform,
not what features it must have. Each requirement below is measurable
(it has a number or a clear yes/no test), and is grouped using the **FURPS**
model: Functionality, Usability, Reliability, Performance, Supportability.

## Functionality
**NFR-01:** The system must support role-based access control with at least
three roles (Salesperson, Sales Manager, Customer Support), verified by
attempting restricted actions with each role and confirming access is
correctly allowed or denied.

## Usability
**NFR-02:** A first-time user must be able to complete the login process in
under 60 seconds without assistance, measured through a usability test with
5 sample users.

## Reliability
**NFR-03:** The system must have an uptime of at least 99% during business
hours (9am–6pm, Monday–Friday), measured monthly using server uptime logs.

## Performance
**NFR-04:** The sales dashboard must fully load within 3 seconds on a
standard 4G mobile connection, measured using browser developer tools
(Network tab) under simulated 4G throttling.

## Supportability
**NFR-05:** The codebase must maintain at least 70% automated unit test
coverage, measured using a coverage tool (e.g., JaCoCo for Java) on every
build.

---

## Summary Table

| ID     | FURPS Category   | Requirement                                             | Measurable Target        |
|--------|------------------|----------------------------------------------------------|----------------------------|
| NFR-01 | Functionality     | Role-based access control (3 roles)                     | Pass/fail per role         |
| NFR-02 | Usability         | First login completed unaided                           | Under 60 seconds           |
| NFR-03 | Reliability       | System uptime during business hours                     | ≥ 99% monthly             |
| NFR-04 | Performance       | Dashboard load time on 4G                              | ≤ 3 seconds               |
| NFR-05 | Supportability    | Automated unit test coverage                            | ≥ 70%                     |

