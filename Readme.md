# Shape Inventory System

A simple Java project demonstrating **Gang of Four (GoF) design patterns** in the context of managing a 2D shape inventory.

---

## **Project Overview**

This project manages a collection of 2D shapes (Circle, Rectangle, Triangle) and demonstrates how to apply design patterns in practice:

* Dynamically create shapes
* Group shapes together
* Notify observers when shapes change
* Encapsulate actions and strategies
* Log creation and updates

All output is printed to the console. No user input is required; random numbers are used for dynamic behavior.

---

## **Design Patterns Used**

### **Creational Pattern**

* **Factory Method**: Dynamically create Circle, Rectangle, or Triangle without specifying concrete classes.

### **Structural Patterns**

* **Composite**: Treat a group of shapes as a single shape for calculating total area.
* **Decorator**: Add logging when shapes are created.

### **Behavioral Patterns**

* **Observer**: Notify when a shape’s area is updated.
* **Command**: Encapsulate "update area" actions.
* **Strategy**: Allow flexible area calculation.

---

## **How to Run**

1. Clone the repository:

```bash
git clone <YOUR_REPO_URL>
cd ShapeInventoryProject
```

2. Compile the project:

```bash
javac src/*.java
```

3. Run the main class:

```bash
java -cp src ShapeInventory
```

All output will be displayed in the console.

---

## **Project Structure**

```
ShapeInventoryProject/
├── src/
│   └── ShapeInventory.java
├── README.md
└── .gitignore
```

---

## **Example Output**

```
[Decorator] Created: Circle(radius=7)
[Decorator] Created: Rectangle(5x3)
[Observer] Shape updated: Circle(radius=7) -> area=153.94
[Composite] Total area of group: 200.12
[Strategy] Area via strategy: 153.94
```

---

## **Author**

Your Name
