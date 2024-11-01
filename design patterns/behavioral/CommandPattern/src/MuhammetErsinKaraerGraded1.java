//import java.util.ArrayList;
//import java.util.Scanner;
//
////Muhammet Ersin Karaer
////20190601205
//
//class Client {
//    public static void main(String[] args) {
//        User user = new User("SE 311 - Software Architecture");
//
//        user.reverse();
//        user.upper();
//        user.clear();
//
//        user.displayHistory();
//
//        System.out.println("\nenter text");
//        User user2 = new User(new Scanner(System.in).nextLine());
//        user2.executeMacroCommand();
//
//        user2.displayHistory();
//    }
//}
//
//class User {
//    private final Manipulator manipulator = new Manipulator();
//    private final Manipulated manipulated;
//
//    public User(String text) {
//        this.manipulated = new Manipulated(text);
//    }
//
//    public void reverse() {
//        manipulator.execute(new ReverseCommand(manipulated));
//    }
//
//    public void upper() {
//        manipulator.execute(new UpperCommand(manipulated));
//    }
//
//    public void clear() {
//        manipulator.execute(new ClearCommand(manipulated));
//    }
//
//    public void executeMacroCommand() {
//        CompoundManipulation compoundManipulation = new CompoundManipulation();
//        compoundManipulation.addCommand(new ClearCommand(manipulated));
//        compoundManipulation.addCommand(new ReverseCommand(manipulated));
//        compoundManipulation.addCommand(new UpperCommand(manipulated));
//        manipulator.execute(compoundManipulation);
//    }
//
//    public void displayHistory() {
//        System.out.println("\ndisplaying history");
//        for (Command command : manipulator.getCommands()) {
//            System.out.print("  ");
//            command.display();
//        }
//    }
//}
//
//class Manipulator {
//    private final ArrayList<Command> commands = new ArrayList<>();
//
//    public void execute(Command command) {
//        command.execute();
//        commands.add(command);
//    }
//
//    public ArrayList<Command> getCommands() {
//        return commands;
//    }
//}
//
//class Manipulated {
//    private String text;
//
//    public Manipulated(String text) {
//        this.text = text;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public void reverse() {
//        printOldState();
//
//        String temp = "";
//        for (int i = text.length() - 1; i >= 0; i--)
//            temp += text.charAt(i);
//        text = temp;
//
//        printNewState();
//    }
//
//    public void upper() {
//        printOldState();
//        text = text.toUpperCase();
//        printNewState();
//    }
//
//    public void clear() {
//        printOldState();
//        text = text.replaceAll("\\s", "");
//        printNewState();
//    }
//
//    private void printOldState() {
//        System.out.print("old: " + text + ", ");
//    }
//
//    private void printNewState() {
//        System.out.println("new: " + text);
//    }
//}
//
//interface Command {
//    void execute();
//
//    void display();
//}
//
//class ReverseCommand implements Command {
//    private final Manipulated manipulated;
//
//    public ReverseCommand(Manipulated manipulated) {
//        this.manipulated = manipulated;
//    }
//
//    @Override
//    public void execute() {
//        manipulated.reverse();
//    }
//
//    @Override
//    public void display() {
//        System.out.println("reverse command");
//    }
//}
//
//class UpperCommand implements Command {
//    private final Manipulated manipulated;
//
//    public UpperCommand(Manipulated manipulated) {
//        this.manipulated = manipulated;
//    }
//
//    @Override
//    public void execute() {
//        manipulated.upper();
//    }
//
//    @Override
//    public void display() {
//        System.out.println("upper command");
//    }
//}
//
//class ClearCommand implements Command {
//    private final Manipulated manipulated;
//
//    public ClearCommand(Manipulated manipulated) {
//        this.manipulated = manipulated;
//    }
//
//    @Override
//    public void execute() {
//        manipulated.clear();
//    }
//
//    @Override
//    public void display() {
//        System.out.println("clear command");
//    }
//}
//
//class CompoundManipulation implements Command {
//    private final ArrayList<Command> commands = new ArrayList<>();
//
//    public void addCommand(Command command) {
//        commands.add(command);
//    }
//
//    @Override
//    public void execute() {
//        for (Command command : commands)
//            command.execute();
//    }
//
//    @Override
//    public void display() {
//        System.out.println("macro command contains: ");
//        for (Command command : commands) {
//            System.out.print("    ");
//            command.display();
//        }
//    }
//}