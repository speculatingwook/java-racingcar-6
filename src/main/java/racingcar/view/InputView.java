package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.util.Conversion;

import java.util.ArrayList;

public class InputView {
    public ArrayList<String> carNameInput() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        // 예외처리 필요
        return Conversion.stringToArrayList(input);
    }

    public int trialCountInput() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = Console.readLine();
        // 예외처리 필요
        return Integer.parseInt(input);
    }
}
