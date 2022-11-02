package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

public class FIFO extends JobScheduler{
	
	public JobDescription obtenerNext() {
        return this.getJobs().get(0);
	}
	
}
