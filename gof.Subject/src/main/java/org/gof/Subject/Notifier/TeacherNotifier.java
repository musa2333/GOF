package org.gof.Subject.Notifier;

public class TeacherNotifier extends Notifier {

	@Override
	public void addListener(Object object, String methodName, Object... objects) {
		// TODO Auto-generated method stub
		System.out.println("we have good teacher for student!!");
		this.getEventHandler().addEvent(object, methodName, objects);
	}

	@Override
	public void notifyx() {
		// TODO Auto-generated method stub
		System.out.println("the teacher is comming!!");
		try {
			this.getEventHandler().Notifyx();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
