package pl.java;

import java.awt.List;
import java.util.ArrayList;

public class Celebrity {
	private String name;
	private boolean canSing;
	private boolean canDance;
	private boolean canAct;
	private boolean canRecite;
	
	public Celebrity(String starName, boolean singer, boolean dancer, boolean actor, boolean reciter) {
		this.name = starName;
		this.canSing = singer;
		this.canDance = dancer;
		this.canAct = actor;
		this.canRecite = reciter;
	}
	public boolean canSing() {
		return canSing;
	}
	public boolean canDance() {
		return canDance;
	}
	public boolean canAct() {
		return canAct;
	}
	public boolean canRecite() {
		return canRecite;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return getName();
	}
		public interface CheckTalent {
			boolean test (Celebrity celebrity);
	}
	public class CheckIfSinger implements CheckTalent {
		public boolean test (Celebrity celebrity) {
			return celebrity.canSing;
		}
	}
	
}
