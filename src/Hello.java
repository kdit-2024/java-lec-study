class 사각형 {
    protected int height;
    protected int width;

    public void 넓이확인() {
        System.out.println(height * width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

class 정사각형 extends 사각형 {
    @Override
    public void setWidth(int width) {
        if (height == 0) {
            this.width = width;
            return;
        }

        if (width == height) {
            this.width = width;
            return;
        }

        System.out.println("정사격형은 width, height가 동일해야 합니다.");

    }

    @Override
    public void setHeight(int height) {
        if (width == 0) {
            this.height = height;
            return;
        }

        if (height == width) {
            this.height = height;
            return;
        }

        System.out.println("정사격형은 width, height가 동일해야 합니다.");
    }

    public void 넓이확인() {
        if (height == 0 || width == 0) {
            System.out.println("오류");
            return;
        }
        System.out.println(height * width);
    }
}

public class Hello {
    public static void main(String[] args) {
        정사각형 s1 = new 정사각형();

        s1.setWidth(10);
        s1.setHeight(10);

        s1.넓이확인();
    }

}
