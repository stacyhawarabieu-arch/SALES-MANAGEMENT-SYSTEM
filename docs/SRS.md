# Software Requirements Specification (SRS)
## Sales Management System
### Version 0.1 (Draft)

> **Note:** This draft follows the standard IEEE-style SRS structure. If your
> lecturer's course notes list slightly different section names, rename the
> headings below to match them — the content underneath remains valid.

---

### 1. Introduction

**1.1 Purpose**
This document specifies the software requirements for the Sales Management
System, a web application supporting sales representatives, pipeline
management, and customer follow-up actions for a sales organisation.

**1.2 Scope**
The system will allow sales representatives to view leads, track
opportunities, download sales reports, and receive follow-up reminders.
It will integrate with SMS notification services and report generation tools.

**1.3 Definitions, Acronyms, and Abbreviations**
- **SRS** — Software Requirements Specification
- **NFR** — Non-Functional Requirement
- **MoSCoW** — Must/Should/Could/Won't Have prioritisation method
- **FURPS** — Functionality, Usability, Reliability, Performance, Supportability

**1.4 References**
- `backlog.md`, `traceability-matrix.md`, `non-functional-requirements.md`,
  `definition-of-done.md` (this repository, `docs/` folder)

**1.5 Overview**
Section 2 describes the system overall; Section 3 lists detailed
requirements; Section 4 lists non-functional requirements; Section 5 lists
appendices.

---

### 2. Overall Description

**2.1 Product Perspective**
The system is a new, standalone web application, replacing manual spreadsheet
and email-based sales tracking.

**2.2 Product Functions**
- Sales representative authentication and dashboards
- Sales pipeline viewing and opportunity tracking
- Sales report generation
- SMS follow-up reminders for meetings and prospects

**2.3 User Classes and Characteristics**
- **Salesperson** — manages leads, opportunities, and customer follow-ups
- **Sales Manager** — reviews team performance and pipelines
- **Customer Support** — views customer interactions and supports handovers

**2.4 Operating Environment**
Modern web browsers (Chrome, Firefox, Edge) on desktop and mobile; backend
runs on a standard Java/JDK 21 server environment.

**2.5 Design and Implementation Constraints**
Must integrate with SMS notification services and secure sales data
reporting workflows.

**2.6 Assumptions and Dependencies**
Assumes reliable CRM data is available for import and that users have
access to a computer or mobile device with internet access.

---

### 3. Specific Requirements

**3.1 Functional Requirements**
See `backlog.md` for the full list of user stories (US-01 to US-05) and
`traceability-matrix.md` for how each maps to a formal requirement ID
(REQ-01 to REQ-05).

**3.2 External Interface Requirements**
- User interface: responsive web pages
- Notification interface: SMS reminders for upcoming follow-ups

**3.3 Use Cases**
See `use-cases.md` for detailed use case descriptions matching each user
story.

---

### 4. Non-Functional Requirements
See `non-functional-requirements.md` for the full list, grouped by FURPS
category (NFR-01 to NFR-05).

---

### 5. Appendices

**5.1 Glossary** — see Section 1.3 above.

**5.2 Revision History**

| Version | Date       | Author      | Description                                 |
|---------|------------|-------------|---------------------------------------------|
| 0.1     | 2026-07-16 | Student     | Initial draft for assignment submission     |
