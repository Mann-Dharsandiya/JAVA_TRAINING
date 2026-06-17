package Day8.OOPS.Encapsulation;

import javax.sound.midi.MidiEvent;

public class App {
    public static void main(String[] args) {
        MITEmp Teacher = new MITEmp("Pankaj", 420, 3000000);

        MITEmp director = new MITEmp("Ranchandar", 515, 400000);

        director.setSalary(700000);

        director.showSalary();

    }
}
