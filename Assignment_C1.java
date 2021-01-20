package com.SnigdhaSingh;

import java.util.*;

class Process {
    String name;
    int arrivalTime;
    int burstTime;

    public static Comparator<Process> arrivalTimeComparator = new Comparator<Process>() {

        public int compare(Process p1, Process p2) {
            /* For ascending order */
            return p1.arrivalTime-p2.arrivalTime;

            /* For descending order */
            // return -(p1.arrivalTime-p2.arrivalTime);
        }};
}

public class Main {
    public static void FCFS(ArrayList<Process> processes) {
        Collections.sort(processes, Process.arrivalTimeComparator);
        System.out.println("Processes scheduled according to FCFS: ");
        for(Process p : processes) {
            System.out.println(p.name);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toContinue;
        ArrayList<Process> processes= new ArrayList<Process>();
        do {
            Process temp = new Process();
            System.out.println("Enter name of the process: ");
            temp.name = scanner.nextLine();
            System.out.println("Enter arrival time: ");
            temp.arrivalTime = scanner.nextInt();
            System.out.println("Enter burst time: ");
            temp.burstTime = scanner.nextInt();
            processes.add(temp);
            System.out.println("Do you want to add another process?(0/1)");
            toContinue = scanner.nextInt();
            scanner.nextLine();
        } while(toContinue != 0);
        FCFS(processes);
    }
}
