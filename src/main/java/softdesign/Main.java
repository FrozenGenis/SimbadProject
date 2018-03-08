package main.java.softdesign;

import simbad.gui.Simbad;
import simbad.sim.Agent;

import javax.vecmath.Vector3d;
import java.util.ArrayList;
import java.util.List;

public class Main {

	private void start() {
		CentralBase centralBase = new CentralBase();
		Map map = centralBase.sendMap();
		List<Agent> swarm = new ArrayList<>();

		if (Environment.WORLD_SIZE <= Environment.SMALL) {
			swarm.add(new Robot(new Vector3d(0, 0, 0), "small", map, Robot.SOUTH));

		Environment environment = new Environment();
		swarm.forEach(environment::add);

		new Simbad(environment, false);
    }
	}

	public static void main(String[] args) {
		new Main().start();
	}
}
