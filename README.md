# ElderScrollsOnline – Console Character Manager

A small Spring Boot console application for **The Elder Scrolls Online**.  
It lets you create and manage characters from the terminal, persisting them to a PostgreSQL database via Hibernate ORM.

> The app starts a simple text menu on launch (via `CommandLineRunner`) where you can add a new character and query existing ones by id or list them.


## Features

- Create a **new character** with the following attributes:
    - `name`, `title`
    - `race`, `role`, `job`, `class`
    - `alliance` (faction)
    - `curse` (status/flag)
    - `damage` (numeric)
    - **armor set**, **weapon set**, and **potions**
- Persist characters to **PostgreSQL** using **Hibernate**.
- Simple **CLI menu** component to drive the workflow.
- Entity mappings and schema are handled by Hibernate (`hbm2ddl.auto=update`).


## Tech stack

- **Java** (Spring Boot console app using `CommandLineRunner`)
- **Spring Framework / Spring Boot**
- **Hibernate ORM** (manual SessionFactory + standard `hibernate.cfg.xml`)
- **PostgreSQL** database
- **Gradle** build with the Gradle **wrapper**

Depending on your Spring Boot version, the default connection pool is **HikariCP**.


## Getting started

### Prerequisites
- JDK 17+ (earlier may work, but 17 is recommended)
- PostgreSQL (local)
- Git and Gradle wrapper (included)

### 1) Database
Create a local database (default name from the examples is `ElderScrollsOnline`).

```sql
CREATE DATABASE "ElderScrollsOnline";
```

### 2) Configuration
The repository contains **example** configuration files. Copy and fill in your local secrets:

```bash
cp src/main/resources/application.properties.example src/main/resources/application.properties
cp src/main/resources/hibernate.cfg.xml.example     src/main/resources/hibernate.cfg.xml
```

Then set your **username** and **password**. The examples point to `127.0.0.1:5432` and enable `hbm2ddl.auto=update` so tables are created/updated automatically.

### 3) Run

Using the Gradle wrapper:

```bash
./gradlew bootRun
```

Or build a jar and run it:

```bash
./gradlew clean build
java -jar build/libs/*.jar
```

On startup you should see a simple **Main Menu** in the console. Follow the prompts to add a character or query an existing one.


## Usage (CLI)

Typical flow:
1. Choose **Create new character** and enter the prompted fields (name, race, role, class, alliance, curse, damage, job, title, sets, potions).
2. Choose **Find/Show** to print one character by **ID** (or list all, depending on the menu option).
3. Repeat or exit.

The menu and prompts are implemented in `GUI/Menu.java`, while persistence is handled in `Database/*` classes and the `Chars/Characters` entity.

