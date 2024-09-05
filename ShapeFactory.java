public class ShapeFactory {

    // ค่าคงที่สำหรับประเภทของรูปร่าง
    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    // จำนวนจำกัดของรูปร่างทั้งหมด
    private static final int MAX_SHAPE_COUNT = 5;
    private static final int MAX_PER_SHAPE = 2;

    // ตัวนับสำหรับแต่ละประเภทของรูปร่างและจำนวนทั้งหมด
    private int totalShapes = 0;
    private int circleCount = 0;
    private int squareCount = 0;
    private int rectangleCount = 0;

    // เมธอด Factory สำหรับสร้างรูปร่าง
    public Shape createShape(String shapeType) throws Exception {
        if (totalShapes >= MAX_SHAPE_COUNT) {
            throw new Exception("ไม่สามารถสร้างรูปร่างเกิน " + MAX_SHAPE_COUNT + " ชิ้น");
        }

        switch (shapeType.toUpperCase()) {
            case CIRCLE:
                if (circleCount >= MAX_PER_SHAPE) {
                    throw new Exception("ไม่สามารถสร้างวงกลมเกิน " + MAX_PER_SHAPE + " ชิ้น");
                }
                circleCount++;
                totalShapes++;
                return new Circle();

            case SQUARE:
                if (squareCount >= MAX_PER_SHAPE) {
                    throw new Exception("ไม่สามารถสร้างสี่เหลี่ยมจัตุรัสเกิน " + MAX_PER_SHAPE + " ชิ้น");
                }
                squareCount++;
                totalShapes++;
                return new Square();

            case RECTANGLE:
                if (rectangleCount >= MAX_PER_SHAPE) {
                    throw new Exception("ไม่สามารถสร้างสี่เหลี่ยมผืนผ้าเกิน " + MAX_PER_SHAPE + " ชิ้น");
                }
                rectangleCount++;
                totalShapes++;
                return new Rectangle();

            default:
                throw new Exception("ประเภทของรูปร่างไม่ถูกต้อง: " + shapeType);
        }
    }
}
