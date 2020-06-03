package template;

public class BlockGame extends BlockTemplate {
    @Override
    public String getTitle() {
        return "Block Game Start";
    }

    @Override
    public String getEndTitle() {
        return "Block Game End";
    }

    @Override
    public Integer getHeight() {
        return 3;
    }

    @Override
    public Integer getWidth() {
        return 4;
    }

    @Override
    public String getCharacter() {
        return "*";
    }
}
