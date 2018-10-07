public class FestivalStatisticsThread extends Thread {
    private FestivalGate festivalGate;
    private boolean running = true;

    /**
     * used to terminate the FestivalStatisticsThread
     */
    public void terminate() {
        this.running = false;
    }

    /**
     * @param festivalGate receives the FestivalGate
     */
    public FestivalStatisticsThread(FestivalGate festivalGate) {
        this.festivalGate = festivalGate;
    }

    /**
     * Method runs a continuous loop the can be terminated using the terminate method.
     * If terminate is not used the thread will continue working
     * This method was more suited than the alternative of using DaemonThread in the context of a running Frame
     * because as log as the frame runs MainThread will not complete and the Daemon Thread will not end
     */
    @Override
    public void run() {
        do {
            StatsBuilder statsBuilder = new StatsBuilder(this.festivalGate);
            statsBuilder.getStats();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (running);
    }
}


