package kr.codesquad.step1_step3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        Input input = new Input();
        System.out.println("참여할 사람은 몇 명인가요?");
        int width = input.value();
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int length = input.value();
        Ladder ladder = new Ladder(width,length);
        ladder.printGame();
    }
}