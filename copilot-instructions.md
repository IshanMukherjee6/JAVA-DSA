# Copilot Instructions for AI Coding Agents

## Project Overview
This workspace contains a collection of standalone Java programs, each implemented in a single `.java` file. There is no unified build system or project structure (such as Maven or Gradle); each file is intended to be compiled and run independently.

## Key Patterns and Conventions
- **Single-file Programs:** Each `.java` file represents a complete program, often with a `main` method. There are no shared libraries or cross-file dependencies.
- **Class Naming:** The class name in each file matches the filename (case-sensitive), e.g., `arraybi.java` contains `class arraybi`.
- **No Packages:** All classes are in the default package. Do not add package declarations.
- **No External Dependencies:** Only standard Java libraries are used. Do not introduce third-party dependencies.

## Developer Workflows
- **Compiling:** Use `javac <filename>.java` to compile individual files. Example: `javac arraybi.java`
- **Running:** Use `java <ClassName>` to run the compiled class. Example: `java arraybi`
- **No Build Scripts:** There are no build scripts or automation tools. All compilation and execution is manual.
- **No Unit Tests:** There are no test files or frameworks present. Testing is done by running the main method and observing output.

## Project-Specific Guidance
- **Keep Programs Independent:** Do not refactor to introduce shared code or dependencies between files.
- **Preserve Simplicity:** Avoid adding complexity such as build tools, configuration files, or advanced Java features not already present.
- **File Naming:** When adding new programs, ensure the filename and class name match exactly.
- **Output:** Programs typically use `System.out.println` for output. Follow this pattern for consistency.

## Example
To add a new program that checks for even numbers:
1. Create `EvenCheck.java` with `class EvenCheck` and a `main` method.
2. Compile: `javac EvenCheck.java`
3. Run: `java EvenCheck`

## Reference Files
- Each `.java` file in the root directory is a standalone example of the above conventions.

---
If any conventions or workflows are unclear, please request clarification or examples from the user.