package com.bridgelabz.oops;
class FinalVariableDemo {


        final int finalVariable = 10;

        void displayFinalVariable() {
            System.out.println("Value of finalVariable: " + finalVariable);
        }
    }


    class FinalMethodDemo {
        final void displayMessage() {
            System.out.println("This is a final method");
        }
    }

    // Final class
    final class FinalClassDemo {
        void display() {
            System.out.println("Inside final class");
        }
    }



    class Main {
        public static void main(String[] args) {

            FinalVariableDemo finalVarDemo = new FinalVariableDemo();
            finalVarDemo.displayFinalVariable();
            FinalMethodDemo finalMethodDemo = new FinalMethodDemo();
            finalMethodDemo.displayMessage();
            FinalClassDemo finalClassDemo = new FinalClassDemo();
            finalClassDemo.display();
        }
    }


