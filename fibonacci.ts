function fibonacci(n: number): number {
  if (n <= 1) return n;
  let a = 0, b = 1;
  for (let i = 2; i <= n; i++) {
    [a, b] = [b, a + b];
  }
  return b;
}

if (import.meta.main) {
  const n = Number(Deno.args[0]);
  if (isNaN(n)) {
    console.error("Please provide a valid integer as input.");
    Deno.exit(1);
  }
  console.log(fibonacci(n));
}
