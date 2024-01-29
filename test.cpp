#include <iostream>
using namespace std;

const int WIDTH = 50;

void initializeArray(bool **grid) {
    for (int i = 0;i < WIDTH; i++) {
        for (int j = 0; j < WIDTH; j++) {
            grid[i][j] = false;
        }
    }
}

void display(bool **grid) {
    for (int i = 0;i < WIDTH; i++) {
        for (int j = 0; j < WIDTH; j++) {
            if (grid[i][j] == true) {
                cout << "* ";
            } else {
                cout << ". ";
            }
        }
        cout << "\n";
    }
}

int main() {

    

    bool **grid = new bool*[WIDTH];
    for (int i = 0; i < WIDTH; i++) {
        grid[i] = new bool[WIDTH];
    }

    initializeArray(grid);
    display(grid);

    return 0;
}