package ui;

import game.Car;

public class CarRenderer {
    /**
     * 자동차의 현재 위치를 궤적 문자열로 만들어 생성합니다.
     *
     * @param car 렌더링할 자동차
     * @return "---"와 같은 자동차 궤적 문자열.
     */
    public static String getMoveTrajectory(Car car) {
        StringBuilder trajectory = new StringBuilder();

        for (int i = 1; i <= car.getPosition(); i++) {
            trajectory.append('-');
        }

        return trajectory.toString();
    }

    /**
     * 자동차 렌더링 결과를 얻습니다.
     *
     * @param car 렌더링할 자동차
     *
     * @return 렌더링 결과
     */
    public static String getCarRendering(Car car) {
        return getMoveTrajectory(car);
    }

    /**
     * 자동차를 렌더링 해 출력합니다.
     *
     * @param car 출력할 자동차
     */
    public static void renderCar(Car car) {
        System.out.print(getCarRendering(car));
    }
}
