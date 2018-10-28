package pl.sda.adacemy.designpatterns.duck;

public class DuckEgg {

    private final Double yolkWeight;
    private final Double whiteWeight;
    private final Double totalWeight;

    private DuckEgg(Double yolkWeight, Double whiteWeight, Double totalWeight) {
        this.yolkWeight = yolkWeight;
        this.whiteWeight = whiteWeight;
        this.totalWeight = totalWeight;
    }

    public Double getYolkWeight() {
        return yolkWeight;
    }

    public Double getWhiteWeight() {
        return whiteWeight;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    @Override
    public String toString() {
        return "DuckEgg{" +
                "yolkWeight=" + yolkWeight +
                ", whiteWeight=" + whiteWeight +
                ", totalWeight=" + totalWeight +
                '}';
    }

    public static class Builder {
        private Double yolkWeight;
        public void setYolkWeight (Double yolkWeight) {
            this.yolkWeight = yolkWeight;
        }

        public DuckEgg bulid() {

            Double calculatedYolkWeight = yolkWeight !=null ? yolkWeight : 0D;



            Double calculatedwhiteWeight = Math.max(calculatedYolkWeight * 1.2, 31D );
            Double calculatedmembraneWeight = (calculatedYolkWeight + calculatedwhiteWeight) * 0.005;
            Double calculatedShellWeight = calculatedwhiteWeight * 0.07;
            if (calculatedShellWeight < 3D) {
                //could be replace Math.max
                calculatedShellWeight = 3D;
            }
            Double totalWeight = calculatedYolkWeight + calculatedwhiteWeight + calculatedmembraneWeight + calculatedShellWeight;
            return new DuckEgg (calculatedYolkWeight, calculatedwhiteWeight, totalWeight);

        }



        }
    }

