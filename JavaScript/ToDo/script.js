function addTask(category) {
    const taskInput = document.getElementById('taskInput');
    const taskText = taskInput?.value.trim();

    if (!taskText) {
        alert('Please enter a task!');
        return;
    }

    const taskElement = document.createElement('div');
    taskElement.classList.add('task');
    taskElement.textContent = taskText;

    document.getElementById(category).appendChild(taskElement);
    taskInput.value = '';

    enableSwipeForTask(taskElement, category);
}

function enableSwipeForTask(task, category) {
    let startX = 0;
    let endX = 0;

    task.addEventListener('touchstart', (e) => {
        startX = e.touches[0].clientX;
    });

    task.addEventListener('touchend', (e) => {
        endX = e.changedTouches[0].clientX;
        handleSwipe(task, startX, endX, category);
    });

    task.addEventListener('mousedown', (e) => {
        startX = e.clientX;

        const onMouseMove = (eMove) => {
            endX = eMove.clientX;
        };

        const onMouseUp = () => {
            handleSwipe(task, startX, endX, category);
            document.removeEventListener('mousemove', onMouseMove);
            document.removeEventListener('mouseup', onMouseUp);
        };

        document.addEventListener('mousemove', onMouseMove);
        document.addEventListener('mouseup', onMouseUp);
    });
}

function handleSwipe(task, startX, endX, category) {
    if (endX - startX > 50) {
        const completedSection = document.getElementById(category + 'c');
        if (completedSection) {
            task.remove();
            completedSection.appendChild(task);
            alert('Task marked as completed!');
        }
    } else if (startX - endX > 50) { 
        alert('Task deleted!');
        task.remove();
    }
}

function enableSwipeToAdd() {
    const tasks = document.querySelectorAll('.task');
    tasks.forEach(task => {
        const parentCategory = task.parentElement.id;
        enableSwipeForTask(task, parentCategory);
    });
}
