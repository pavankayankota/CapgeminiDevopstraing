package AssignmenrGroovy
//5.Prime NumbersWrite a method called isPrime that takes an integer argument and returns a boolean. Determine whether the number is prime by dividing it by all numbers from 2 up to one less than the number.
def isPrime(num) {
	def i
	def flag=0
	for(i=2; i<=num; i++) {
		if(num%i==0) {
			flag=1
			break
		}
	}
	if(flag==0 ) {
		return true
	}
	else {
		return false
	}
}