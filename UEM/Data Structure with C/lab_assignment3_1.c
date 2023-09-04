// 1) Write a Menu driven C program to accomplish the following functionalities in single linked list.
//     a) Create a single linked list.
//     b) Display the elements of a single linked list.
//     c) Insert a node at the beginning of a single linked list.
//     d) Insert a node at the end of a single linked list.
//     e) Insert a node before a given node of a single linked list.
//     f) Insert a node after a given node of a single linked list.
//     g) Delete a node from the beginning of a single linked list.
//     h) Delete a node from the end of a single linked list.
//     i) Delete a node after a given node of a single linked list.
//     j) Delete the entire single linked list.

#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *head = NULL;
void create()
{
    struct node *newnode, *temp;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data\n");
    scanf("%d", &newnode->data);
    newnode->next = NULL;
    if (head == NULL)
    {
        head = newnode;
        temp = newnode;
    }
    else
    {
        temp->next = newnode;
        temp = newnode;
    }
}
void display()
{
    struct node *temp;
    temp = head;
    if (head == NULL)
    {
        printf("The list is empty\n");
    }
    else
    {
        while (temp != NULL)
        {
            printf("%d \n", temp->data);
            temp = temp->next;
        }
    }
}
void insert_begin()
{
    struct node *newnode;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data\n");
    scanf("%d", &newnode->data);
    newnode->next = head;
    head = newnode;
}
void insert_end()
{
    struct node *newnode, *temp;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data\n");
    scanf("%d", &newnode->data);
    newnode->next = NULL;
    temp = head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    temp->next = newnode;
}
void insert_before()
{
    struct node *newnode, *temp, *prev;
    int key;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data\n");
    scanf("%d", &newnode->data);
    newnode->next = NULL;
    printf("Enter the key\n");
    scanf("%d", &key);
    temp = head;
    while (temp->data != key)
    {
        prev = temp;
        temp = temp->next;
    }
    prev->next = newnode;
    newnode->next = temp;
}
void insert_after()
{
    struct node *newnode, *temp;
    int key;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data\n");
    scanf("%d", &newnode->data);
    newnode->next = NULL;
    printf("Enter the key\n");
    scanf("%d", &key);
    temp = head;
    while (temp->data != key)
    {
        temp = temp->next;
    }
    newnode->next = temp->next;
    temp->next = newnode;
}
void delete_begin()
{
    struct node *temp;
    temp = head;
    head = head->next;
    free(temp);
}
void delete_end()
{
    struct node *temp, *prev;
    temp = head;
    while (temp->next != NULL)
    {
        prev = temp;
        temp = temp->next;
    }
    prev->next = NULL;
    free(temp);
}
void delete_after()
{
    struct node *temp, *prev;
    int key;
    printf("Enter the key\n");
    scanf("%d", &key);
    temp = head;
    while (temp->data != key)
    {
        prev = temp;
        temp = temp->next;
    }
    prev->next = temp->next;
    free(temp);
}
void delete_list()
{
    struct node *temp;
    temp = head;
    while (temp != NULL)
    {
        head = head->next;
        free(temp);
        temp = head;
    }
}
int main(int argc, char const *argv[])
{
    int choice;
    while (1)
    {
        printf("********* MENU *********\n");
        printf("1. Create a single linked list\n");
        printf("2. Display the elements of a single linked list\n");
        printf("3. Insert a node at the beginning of a single linked list\n");
        printf("4. Insert a node at the end of a single linked list\n");
        printf("5. Insert a node before a given node of a single linked list\n");
        printf("6. Insert a node after a given node of a single linked list\n");
        printf("7. Delete a node from the beginning of a single linked list\n");
        printf("8. Delete a node from the end of a single linked list\n");
        printf("9. Delete a node after a given node of a single linked list\n");
        printf("10. Delete the entire single linked list\n");
        printf("11. Exit\n");
        printf("Enter your choice\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            create();
            break;
        case 2:
            display();
            break;
        case 3:
            insert_begin();
            break;
        case 4:
            insert_end();
            break;
        case 5:
            insert_before();
            break;
        case 6:
            insert_after();
            break;
        case 7:
            delete_begin();
            break;
        case 8:
            delete_end();
            break;
        case 9:
            delete_after();
            break;
        case 10:
            delete_list();
            break;
        case 11:
            exit(0);
            break;
        default:
            printf("Invalid choice\n");
            break;
        }
    }
    return 0;
}