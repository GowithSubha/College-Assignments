// 2) Write a Menu driven C program to accomplish the following functionalities in circular linked list.
//     a) Create a circular linked list.
//     b) Display the elements of a circular linked list.
//     c) Insert a node at the beginning of a circular linked list.
//     d) Insert a node at the end of a circular linked list.
//     e) Delete a node from the beginning of a circular linked list.
//     f) Delete a node from the end of a circular linked list.
//     g) Delete a node after a given node of a circular linked list.
//     h) Delete the entire circular linked list.

#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *head = NULL;
struct node *tail = NULL;
void create()
{
    int n;
    printf("Enter the number of nodes you want to create: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        struct node *newnode = (struct node *)malloc(sizeof(struct node));
        printf("Enter the data of node %d: ", i + 1);
        scanf("%d", &newnode->data);
        newnode->next = NULL;
        if (head == NULL)
        {
            head = newnode;
            tail = newnode;
            newnode->next = head;
        }
        else
        {
            tail->next = newnode;
            tail = newnode;
            tail->next = head;
        }
    }
}
void display()
{
    struct node *temp = head;
    if (head == NULL)
    {
        printf("The list is empty\n");
    }
    else
    {
        printf("The elements of the list are: ");
        while (temp->next != head)
        {
            printf("%d ", temp->data);
            temp = temp->next;
        }
        printf("%d\n", temp->data);
    }
}
void insert_at_beginning()
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data of the newnode: ");
    scanf("%d", &newnode->data);
    newnode->next = NULL;
    if (head == NULL)
    {
        head = newnode;
        tail = newnode;
        newnode->next = head;
    }
    else
    {
        newnode->next = head;
        head = newnode;
        tail->next = head;
    }
}
void insert_at_end()
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data of the newnode: ");
    scanf("%d", &newnode->data);
    newnode->next = NULL;
    if (head == NULL)
    {
        head = newnode;
        tail = newnode;
        newnode->next = head;
    }
    else
    {
        tail->next = newnode;
        tail = newnode;
        tail->next = head;
    }
}
void delete_from_beginning()
{
    if (head == NULL)
    {
        printf("The list is empty\n");
    }
    else
    {
        struct node *temp = head;
        head = head->next;
        tail->next = head;
        free(temp);
    }
}
void delete_from_end()
{
    if (head == NULL)
    {
        printf("The list is empty\n");
    }
    else
    {
        struct node *temp = head;
        while (temp->next != tail)
        {
            temp = temp->next;
        }
        temp->next = head;
        free(tail);
        tail = temp;
    }
}
void delete_after_node()
{
    if (head == NULL)
    {
        printf("The list is empty\n");
    }
    else
    {
        int key;
        printf("Enter the key after which you want to delete the node: ");
        scanf("%d", &key);
        struct node *temp = head;
        while (temp->data != key)
        {
            temp = temp->next;
        }
        struct node *temp1 = temp->next;
        temp->next = temp1->next;
        free(temp1);
    }
}
void delete_list()
{
    if (head == NULL)
    {
        printf("The list is empty\n");
    }
    else
    {
        struct node *temp = head;
        while (temp->next != head)
        {
            struct node *temp1 = temp;
            temp = temp->next;
            free(temp1);
        }
        free(temp);
        head = NULL;
        tail = NULL;
    }
}

int main()
{
    int choice;
    while (1)
    {   printf("*************** MENU ***************\n");
        printf("Enter 1 to create a circular linked list\n");
        printf("Enter 2 to display the elements of the circular linked list\n");
        printf("Enter 3 to insert a node at the beginning of the circular linked list\n");
        printf("Enter 4 to insert a node at the end of the circular linked list\n");
        printf("Enter 5 to delete a node from the beginning of the circular linked list\n");
        printf("Enter 6 to delete a node from the end of the circular linked list\n");
        printf("Enter 7 to delete a node after a given node of the circular linked list\n");
        printf("Enter 8 to delete the entire circular linked list\n");
        printf("Enter 9 to exit\n");
        printf("Enter your choice: ");
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
            insert_at_beginning();
            break;
        case 4:
            insert_at_end();
            break;
        case 5:
            delete_from_beginning();
            break;
        case 6:
            delete_from_end();
            break;
        case 7:
            delete_after_node();
            break;
        case 8:
            delete_list();
            break;
        case 9:
            exit(0);
        default:
            printf("Invalid choice\n");
        }
    }
    return 0;
}