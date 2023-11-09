	import java.util.Timer;
	import java.util.TimerTask;

	public class reminder {
	    private Timer timer = new Timer();

	    public void addReminder(String message, int delayInSeconds) {
	        System.out.println("Aggiungere un reminder: " + message);

	        timer.schedule(new TimerTask() {
	            @Override
	            public void run() {
	                System.out.println("Reminder: " + message);
	            }
	        }, delayInSeconds * 1000);
	    }
	}


