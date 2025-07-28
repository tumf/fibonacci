function fibonacci(n: number): number {
  if (n < 0) throw new Error("Input must be non-negative");
  if (n === 0) return 0;
  if (n === 1) return 1;
  let a = 0, b = 1;
  for (let i = 2; i <= n; i++) {
    [a, b] = [b, a + b];
  }
  return b;
}

if (import.meta.main) {
  if (Deno.args.length !== 1) {
    console.error("Usage: deno run fibonacci.ts <n>");
    Deno.exit(1);
  }
  const n = Number(Deno.args[0]);
  if (!Number.isInteger(n) || n < 0) {
    console.error("n must be a non-negative integer");
    Deno.exit(1);
  }
  console.log(fibonacci(n));
}

