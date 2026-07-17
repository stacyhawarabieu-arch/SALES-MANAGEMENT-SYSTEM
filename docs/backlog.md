# Product Backlog — Sales Management System

This backlog lists the user stories for the Sales Management System.
Each story has a unique ID, a use-case reference, a MoSCoW priority, and at
least one Given–When–Then acceptance scenario, as required by the assignment.

The stories below are ordered from highest to lowest priority so they can be
placed directly onto a GitHub Projects board.

---

## US-01 — Sales Rep Login
**As a** salesperson
**I want** to log in with my sales system ID and password
**So that** I can access my sales dashboard securely

- **Use Case Link:** [UC-01 Sales Rep Authentication](./use-cases.md#uc-01)
- **MoSCoW Priority:** Must Have

**Acceptance Criteria**
```
Given a registered salesperson with a valid system ID and password
When the salesperson submits the login form with correct credentials
Then the system grants access and redirects to the sales dashboard
```

---

## US-02 — View Sales Pipeline
**As a** salesperson
**I want** to view my active leads and opportunities
**So that** I can track my sales pipeline

- **Use Case Link:** [UC-02 View Sales Pipeline](./use-cases.md#uc-02)
- **MoSCoW Priority:** Must Have

**Acceptance Criteria**
```
Given a logged-in salesperson with assigned leads
When the salesperson opens the "Sales Pipeline" section of the dashboard
Then the system displays open opportunities with dates, values, and status
```

---

## US-03 — Download Sales Report
**As a** salesperson
**I want** to download a PDF sales report after a period of work
**So that** I can review my performance and customer activity

- **Use Case Link:** [UC-03 Download Sales Report](./use-cases.md#uc-03)
- **MoSCoW Priority:** Should Have

**Acceptance Criteria**
```
Given a salesperson with completed opportunities
When the salesperson clicks "Download Report"
Then the system generates and downloads a PDF report containing
     the sales figures, dates, and account summaries
```

---

## US-04 — Dark Mode Toggle
**As a** user of the portal
**I want** to switch between light and dark themes
**So that** I can use the system comfortably at night

- **Use Case Link:** [UC-04 Toggle Theme](./use-cases.md#uc-04)
- **MoSCoW Priority:** Could Have

**Acceptance Criteria**
```
Given a user is on any page of the portal
When the user clicks the theme toggle switch
Then the interface switches between light and dark mode
     and remembers the choice on the next visit
```

---

## US-05 — SMS Follow-Up Reminder
**As a** salesperson
**I want** to receive an SMS reminder before a follow-up
**So that** I do not miss an important customer meeting

- **Use Case Link:** [UC-05 SMS Follow-Up Reminder](./use-cases.md#uc-05)
- **MoSCoW Priority:** Won't Have (this release)

**Acceptance Criteria**
```
Given a salesperson with an upcoming follow-up meeting and a valid phone number
When the meeting is 1 day away
Then the system sends an SMS reminder to the salesperson's registered number
```

---

## Summary Table

| ID     | Title                    | Priority         | Use Case |
|--------|--------------------------|------------------|----------|
| US-01  | Sales Rep Login          | Must Have        | UC-01    |
| US-02  | View Sales Pipeline      | Must Have        | UC-02    |
| US-03  | Download Sales Report    | Should Have      | UC-03    |
| US-04  | Dark Mode Toggle         | Could Have       | UC-04    |
| US-05  | SMS Follow-Up Reminder   | Won't Have (this release) | UC-05    |
