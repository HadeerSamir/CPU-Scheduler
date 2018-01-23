package cpu.sheduler;

public class Process {

    int processId;
    float burstTime;
    float arrivalTime;
    int priority;
    float waitingTime;

    public Process() {
        processId = 0;
        burstTime = 0;
        arrivalTime = 0;
        priority = 0;
        waitingTime = 0;
    }

    public Process(int processId, float burstTime, float arrivalTime, float waitingTime) {

        this.processId = processId;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.waitingTime = waitingTime;
    }

    public Process(int processId, float burstTime, float arrivalTime) {

        this.processId = processId;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
    }

    public Process(float waitingTime) {

        this.waitingTime = waitingTime;

    }

    public Process(int processId, float burstTime, float arrivalTime, int priority) {

        this.processId = processId;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.priority = priority;
    }

    public Process(int processId, float burstTime, int priority, float arrivalTime, float waiting) {

        this.processId = processId;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.waitingTime = waiting;
        this.priority = priority;
    }

}
