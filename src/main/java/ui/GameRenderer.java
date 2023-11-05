package ui;

import game.Car;
import game.Game;

import java.util.List;

public class GameRenderer {
    public static String getCarsTrajectories(List<Car> carList) {
        if (carList.size() == 0) {
            return "";
        }

        StringBuilder trajectories = new StringBuilder();

        for (Car car : carList) {
            trajectories.append(CarRenderer.getMoveTrajectory(car))
                    .append("\n");
        }

        // 마지막에 추가된 \n 제거
        trajectories.deleteCharAt(trajectories.length() - 1);

        return trajectories.toString();
    }


    /**
     * 게임을 렌더링 한 결과를 얻습니다.
     *
     * @param game 렌더링 할 레이싱 게임 상태 객체
     */
    public static String getGameRendering(Game game) {
        return getCarsTrajectories(game.getCarList());
    }

    /**
     * 게임을 화면에 출력합니다.
     *
     * @param game 출력할 레이싱 게임 상태 객체
     */
    public static void renderGame(Game game) {
        System.out.println(getGameRendering(game));
    }
}
