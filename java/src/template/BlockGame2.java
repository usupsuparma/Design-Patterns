package template;

public class BlockGame2 extends BlockTemplate {
    @Override
    public String getTitle() {
        return "Start Game 2";
    }

    @Override
    public String getEndTitle() {
        return "End Game 2";
    }

    @Override
    public Integer getHeight() {
        return 4;
    }

    @Override
    public Integer getWidth() {
        return 5;
    }

    @Override
    public String getCharacter() {
        return "#";
    }
}
