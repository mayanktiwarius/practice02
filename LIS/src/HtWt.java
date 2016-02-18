
public class HtWt  implements Comparable<HtWt>{

	private float height;
	
	private float weight;
	
	public HtWt(float height, float weight) {
		this.height = height;
		this.weight = weight;
	}
	@Override
	public int compareTo(HtWt o) {
		// TODO Auto-generated method stub
		if(this.height != o.height) {
			return ((Float)this.height).compareTo(o.height);
		} else {
			return ((Float) this.weight).compareTo(o.weight);
		}
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean isBefore(HtWt other) {
		if (this.height < other.height && this.weight < other.weight) return true;
		return false;
	}
	@Override
	public String toString() {
		return "HtWt [height=" + height + ", weight=" + weight + "]";
	}
	
	
	
}
