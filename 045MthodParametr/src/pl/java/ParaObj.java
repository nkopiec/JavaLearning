package pl.java;

class ParaObj {
		Object first;
		Object last;

		public ParaObj(Object f, Object l) {
			first = f;
			last = l;
		}


		public Object getFirst() { return first; }
		public Object getLast()   { return last; }

		public void setFirst(Object f) { first = f; }
		public void setLast(Object l) { last = l; }
	}

