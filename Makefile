CC=gcc
CFLAGS=-Wall -O2
TARGET=fibonacci
SRC=fibonacci.c

all: $(TARGET)

$(TARGET): $(SRC)
	$(CC) $(CFLAGS) -o $(TARGET) $(SRC)

clean:
	rm -f $(TARGET)