//================================
//CSCI3200_DA_3409_Summer2018
//Nathaniel Parizi
//Assignment 5 (CH5)
//Problem 4 
//================================

class Map<Key, Val> {
	// instance variables
	private QuadraticProbingHashTable<Entry<Key, Val>> items;

	// constructor
	public Map() {
		items = new QuadraticProbingHashTable<Entry<Key, Val>>();
	}

	// put method requires both key and val
	public void put(Key key, Val val) {
		items.insert(new Entry(key, val));
	}

	// get method only requires key
	public Val get(Key key) {
		Val val = (Val) items.get(new Entry(key)).value;
		return val;
	}

	// isEmpty
	public boolean isEmpty() {
		if (items.capacity() == 0) {
			return true;
		}
		return false;
	}

	// make empty
	public void makeEmpty() {
		items.makeEmpty();
	}

	// Entry class to enter key and values into Hashmap
	private static class Entry<Key, Val> {
		// instnace variables
		Key key;
		public Val value;

		// constructor for key and val
		Entry(Key k, Val v) {
			this.key = k;
			this.value = v;
		}

		// constructor for only key
		Entry(Key k) {
			this.key = k;
			this.value = null;
		}

		@Override
		public boolean equals(Object obj) {

			Entry mObj = (Entry) obj;
			if (this == obj)
				return true;
			if (obj == null)
				return false;

			if (mObj.key != null && !key.equals(mObj.key) && key == null) {
				return false;
			} else {

				return true;
			}
		}

		@Override
		public int hashCode() {
			final int prime = 89;
			int result = 1;
			result = prime * result;
			if (key != null) {
				result = result + key.hashCode();
			}
			return result;
		}

		// to string method
		public String toString() {
			return "" + value;
		}
	}
}
