package pl.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

public class CarI extends Vehicle {
private static final Object MOVING = null;
private int fuel;

private class FuelConsume implements ActionListener {

	public void actionPerformed1(ActionEvent e) {
		fuel -= 1;
		if (fuel == 0) stop();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
private Timer fuelTimer = new Timer();

@Override
public CarI start() {
	if (getState() == MOVING) return  this;
	if (fuel > 0) {
		super.start();
		if (getState() == MOVING)
			((CarI) fuelTimer).start();
		
	}
	else error("bac is empty");
	return this;
		
   }


	private void error(String string) {
	// TODO Auto-generated method stub
	
}


	private Object getState() {
	// TODO Auto-generated method stub
	return null;
}


	@Override
	public CarI stop() {
		((CarI) fuelTimer).stop();
		super.stop();
		return this;
		
	}
	@Override
	public void crash(Vehicle v) {
		((fuel) this.fuelTimer).stop();
		if (v instanceof CarI) ((Vehicle) ((CarI) v).fuelTimer).stop();
		
	}
	
	
	



}
}
