package eud.sample;

// 다중상속이 가능 
public class LGWashingMachine implements WashingMachine , dryCouse {

	@Override
	public void startButtonPressed() {
		System.out.println("세탁기가 빨래를 시작했습니다.");
	}

	@Override
	public void pauseButtonPressed() {
		System.out.println("세탁기가 빨래를 중지했습니다.");
	}

	@Override
	public void stopButtonPressed() {
		System.out.println("세탁기가 빨래를 일시 중지하였습니다.");
	}

	@Override
	public int changeSpeed(int speed) {
		int rtnSpeed = 0;
		switch(speed) {
		case 1:
			rtnSpeed = 20;
			break;
		case 2:
			rtnSpeed = 50;
			break;
		case 3:
			rtnSpeed = 100;
			break;
		}
		return rtnSpeed;
	}
	@Override
	public void dry() {
		System.out.println("세탁기가 완료되어 건조하기 시작하였습니다. ");
	}
}
