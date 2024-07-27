class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def create_binary_tree_recursive():
    data = int(input("Enter data for the root node (or -1 to stop): "))
    if data == -1:
        return None
    root = TreeNode(data)
    print("Creating left subtree of", root.data)
    root.left = create_binary_tree_recursive()
    print("Creating right subtree of", root.data)
    root.right = create_binary_tree_recursive()
    return root

def display_level_order(root):
    if root is None:
        return
    queue = [root]
    while queue:
        node_count = len(queue)
        while node_count > 0:
            temp_node = queue.pop(0)
            print(temp_node.data, end=' ')
            if temp_node.left:
                queue.append(temp_node.left)
            if temp_node.right:
                queue.append(temp_node.right)
            node_count -= 1
        print()

def create_binary_tree_non_recursive():
    root = None
    data = int(input("Enter data for the root node (or -1 to stop): "))
    if data == -1:
        return None
    root = TreeNode(data)
    queue = [root]
    while queue:
        current_node = queue.pop(0)
        left_data = int(input(f"Enter left child of {current_node.data} (-1 for no child): "))
        if left_data != -1:
            current_node.left = TreeNode(left_data)
            queue.append(current_node.left)
        right_data = int(input(f"Enter right child of {current_node.data} (-1 for no child): "))
        if right_data != -1:
            current_node.right = TreeNode(right_data)
            queue.append(current_node.right)
    return root

def create_binary_tree_array():
    num_elements = int(input("Enter the number of elements you want to insert: "))
    arr = []
    for _ in range(num_elements):
        data = input("Enter data for the next node (or 'None' for None value): ")
        if data.lower() == 'none':
            arr.append(None)
        else:
            arr.append(int(data))
    root = None
    if arr:
        root = TreeNode(arr[0])
        queue = [root]
        i = 1
        while queue and i < len(arr):
            current_node = queue.pop(0)
            if arr[i] is not None:
                current_node.left = TreeNode(arr[i])
                queue.append(current_node.left)
            i += 1
            if i < len(arr) and arr[i] is not None:
                current_node.right = TreeNode(arr[i])
                queue.append(current_node.right)
            i += 1
    return root

def height_of_binary_tree(root):
    if root is None:
        return 0
    else:
        left_height = height_of_binary_tree(root.left)
        right_height = height_of_binary_tree(root.right)
        return max(left_height, right_height) + 1

def degree_of_node(root, key):
    if root is None:
        return 0
    if root.data == key:
        if root.left is not None and root.right is not None:
            return 2
        elif root.left is None and root.right is None:
            return 0
        else:
            return 1
    else:
        return degree_of_node(root.left, key) + degree_of_node(root.right, key)

def count_leaf_nodes(root):
    if root is None:
        return 0
    elif root.left is None and root.right is None:
        return 1
    else:
        return count_leaf_nodes(root.left) + count_leaf_nodes(root.right)

def count_internal_nodes(root):
    if root is None or (root.left is None and root.right is None):
        return 0
    else:
        return 1 + count_internal_nodes(root.left) + count_internal_nodes(root.right)

def count_nodes_linked_list(root):
    if root is None:
        return 0
    else:
        return 1 + count_nodes_linked_list(root.left) + count_nodes_linked_list(root.right)

def count_nodes_array(root):
    count = 0
    if root:
        queue = [root]
        while queue:
            current_node = queue.pop(0)
            count += 1
            if current_node.left:
                queue.append(current_node.left)
            if current_node.right:
                queue.append(current_node.right)
    return count

def count_siblings(root, key):
    if root is None:
        return 0
    if root.left and root.right:
        if root.left.data == key or root.right.data == key:
            return 1
        else:
            return count_siblings(root.left, key) + count_siblings(root.right, key)
    else:
        return count_siblings(root.left, key) + count_siblings(root.right, key)

def main():
    root = None
    while True:
        print("\nMenu:")
        print("1. Create binary tree using recursive function and display level-wise")
        print("2. Create binary tree using non-recursive function and display level-wise")
        print("3. Create binary tree using array only and display level-wise")
        print("4. Identify the height of a binary tree")
        print("5. Identify the degree of a given node")
        print("6. Count the number of leaf nodes in a binary tree")
        print("7. Count the number of internal nodes in a binary tree")
        print("8. Count the number of nodes in a given binary tree using linked list")
        print("9. Count the number of nodes in a given binary tree using array")
        print("10. Count the number of siblings present in a binary tree")
        print("11. Exit")
        choice = int(input("Enter your choice: "))

        if choice == 1:
            print("\nCreate binary tree using recursive function and display level-wise:")
            root = create_binary_tree_recursive()
            if root:
                print("Binary tree displayed level-wise:")
                display_level_order(root)
        elif choice == 2:
            print("\nCreate binary tree using non-recursive function and display level-wise:")
            root = create_binary_tree_non_recursive()
            if root:
                print("Binary tree displayed level-wise:")
                display_level_order(root)
        elif choice == 3:
            print("\nCreate binary tree using array only and display level-wise:")
            root = create_binary_tree_array()
            if root:
                print("Binary tree displayed level-wise:")
                display_level_order(root)
        elif choice == 4:
            if root:
                print("\nHeight of the binary tree:", height_of_binary_tree(root))
            else:
                print("Binary tree is not created yet.")
        elif choice == 5:
            key = int(input("Enter the key to find the degree of: "))
            if root:
                print("Degree of the given node:", degree_of_node(root, key))
            else:
                print("Binary tree is not created yet.")
        elif choice == 6:
            if root:
                print("Number of leaf nodes:", count_leaf_nodes(root))
            else:
                print("Binary tree is not created yet.")
        elif choice == 7:
            if root:
                print("Number of internal nodes:", count_internal_nodes(root))
            else:
                print("Binary tree is not created yet.")
        elif choice == 8:
            if root:
                print("Number of nodes using linked list:", count_nodes_linked_list(root))
            else:
                print("Binary tree is not created yet.")
        elif choice == 9:
            if root:
                print("Number of nodes using array:", count_nodes_array(root))
            else:
                print("Binary tree is not created yet.")
        elif choice == 10:
            key = int(input("Enter the key to find the number of siblings: "))
            if root:
                print("Number of siblings:", count_siblings(root, key))
            else:
                print("Binary tree is not created yet.")
        elif choice == 11:
            print("Exiting...")
            break
        else:
            print("Invalid choice! Please enter a number between 1 and 11.")

if __name__ == "__main__":
    main()
