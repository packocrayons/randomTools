#include <stdlib.h>

template<typename T>
struct Node {
	T data;
	Node<T>* next;
};

template<typename T>
T ll_get(int index, Node<T>* head){
	Node<T>* current = head;
	for (int i = 0; i < index; i++){
		current = current->next;
	}
	return current.data;
}

template<typename T>
void ll_add(T data, int index, Node<T>* head) {
	// Send an index greater than the end of the list and a new Node<T> will be made at the end of the list
	Node<T>* current = head, temp;
	for (int i = 0; i < index && current->next != NULL; i++){
		current = current->next;
	}
	temp = current->next;
	current->next = malloc(sizeof(Node<T>));
	current->next.data = data;
	current->next.next = temp;
}

template<typename T>
void ll_delete(Node<T>* head) {
	Node<T>* current = head;
	Node<T>* last = current;
	for(;current->next != NULL; current = current->next){
		free(last);
		last = current;
	}
}
