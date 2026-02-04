# 📚 The Shared "Library of Wisdom"

Welcome to the *Library of Wisdom*, a collaborative Android app built with *Kotlin and Jetpack Compose*. This project is a digital encyclopedia where knowledge entries are managed collaboratively, teaching teamwork, Git workflow, and conflict resolution.

---

## Table of Contents

1. [Member Roles](#member-roles)  
2. [Objective](#objective)  
3. [Project Setup](#project-setup)  
4. [Git Workflow](#git-workflow)  
5. [Assessment Checklist](#assessment-checklist)  
6. [Usage](#usage)  
7. [Logcat Output](#logcat-output)  

---

## Member Roles

| Member        | Role        | Task |
|---------------|------------|------|
| Gonzales, Rosales | The Navigator | Create a CONTRIBUTING.md file with rules for the repo |
| Estrella      | The Historian | Create a history.md file and add 3 facts about Git |
| Monte         | The Stylist   | Update the README.md with a header, logo placeholder, and table of contents |
| Cantalejo, Sexiona, Fulgencio | The Coder | Create the MainActivity.kt with a centered button logging “Welcome to the library” |
| Fernandez, Baje, Dado, Sumayao | The Editor | Edit the README.md to add a “Project Mission Statement” |

---

## Objective

Collaboratively build a *single Android app digital encyclopedia* while managing feature branches, pull requests, and merge conflicts.

---

## Project Setup

1. *Lead:* One student creates the GitHub repository and adds collaborators.  
2. *Scaffold:* Lead pushes the initial README.md and a data/ folder containing a blank entries.json.  
3. *Rules:* No one is allowed to push directly to main. All changes must go through Pull Requests (PRs).  

---

## Git Workflow

1. *Branches:* Work on separate feature branches; avoid committing directly to main.  
2. *Pull Requests:* Submit PRs for teammates to review before merging.  
3. *Conflict Resolution:* If merge conflicts occur, pull the updated main branch into your feature branch, resolve conflicts manually, and push the changes.  
4. *Review Etiquette:* Each PR must be reviewed and include at least one comment before merging.  

---

## Assessment Checklist

### 1. Branching: Did contributors use feature branches or accidentally commit to main?

*Answer:*  
Yes. All contributors strictly followed the required Git workflow by creating and working on their own feature branches. No direct commits were made to the main branch, which demonstrates proper understanding of branch management and collaborative development practices.

---

### 2. Commit Messages: Are they descriptive (e.g., “Add history file”) or vague (e.g., “update”)?

*Answer:*  
Yes. The commit messages were clear, specific, and descriptive. Examples such as “Add MainActivity.kt”, “Create history.md”, and “Update README table of contents” accurately describe the changes made. This made the project history easy to read, understand, and trace.

---

### 3. PR Etiquette: Did they explain their changes in the Pull Request description?

*Answer:*  
Yes. Each Pull Request included a meaningful description explaining the purpose of the changes. Teammates also reviewed the PRs and provided at least one comment before approving and merging, showing proper adherence to collaborative review practices.

---

### 4. Conflict Resolution: Did they resolve the conflict without deleting their teammate’s work?

*Answer:*  
Yes. When a merge conflict occurred in the README.md file, the student carefully pulled the updated main branch into their feature branch and resolved the conflict manually. Both their own work and their teammate’s contributions were preserved, demonstrating good conflict resolution skills and a solid understanding of Git integration.

---

## Usage

To run the app locally on Android:

1. Clone the repository:
   ```bash
   git clone https://github.com/ajgonzales20/Library-Of-Wisdom.git

---

## Logcat Output
D/LibraryLog: Welcome to the library
