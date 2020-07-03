package test;

public class MAZTestMain {
	public static void main(String[] args) {
		MAZTestFrame mazFrame = new MAZTestFrame(false);
		mazFrame.init();
		mazFrame.start();
	}
}

// Mouse Right Drag = Move
// Mouse Wheel = Zoom

// Layer Pattern 만들기.
// 하나의 Layer Master Panel에 여러 Layer를 추가.
// 각 Layer는 Paint, Mouse, Keyboard Interface를 가짐. 
// 마스터에 꽃으면 그대로 사용.