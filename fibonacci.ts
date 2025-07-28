// Fibonacci function in TypeScript
// Returns the nth Fibonacci number
function fibonacci(n: number): number {
  if (n < 0) throw new Error('Input must be non-negative');
  if (n === 0) return 0;
  if (n === 1) return 1;
  let a = 0, b = 1;
  for (let i = 2; i <= n; i++) {
    const temp = a + b;
    a = b;
    b = temp;
  }
  return b;
}

// Example usage:
console.log(fibonacci(10)); // Output: 55
