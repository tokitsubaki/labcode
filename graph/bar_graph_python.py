import matplotlib.pyplot as plt
import matplotlib
import numpy as np
matplotlib.use('agg')

# 基本形
left = [1, 2, 3]
height = [100, 200, 300]
plt.bar(left, height)
plt.savefig("bar_graph_python_figure01.jpg")
plt.clf()
plt.close()

# グラフ幅
left = [1, 2, 3]
height = [100, 200, 300]
plt.bar(left, height, width=1.0)
plt.savefig("bar_graph_python_figure02.jpg")
plt.close()

# 棒の色、枠線の色、太さを設定
left = [1, 2, 3]
height = [100, 200, 300]
plt.bar(left, height, color="#00FF00", edgecolor="#FF0000", linewidth=3)
plt.savefig("bar_graph_python_figure03.jpg")
plt.close()

# 棒の位置を設定
left = [1, 2, 3]
height = [100, 200, 300]
plt.bar(left, height, align="center")
plt.savefig("bar_graph_python_figure04.jpg")
plt.close()

# 横軸にラベルを設定
left = [1, 2, 3]
height = [100, 200, 300]
label = ["one", "two", "three"]
plt.bar(left, height, tick_label=label)
plt.savefig("bar_graph_python_figure05.jpg")
plt.close()

# グラフのタイトル、縦軸、横軸のタイトル、グリッドを設定
left = [1, 2, 3]
height = [100, 200, 300]
plt.bar(left, height)
plt.title("Title sample")
plt.xlabel("x axis sample")
plt.ylabel("y axis sample")
plt.grid(True)
plt.savefig("bar_graph_python_figure06.jpg")
plt.close()

# エラーバーを表示
left = [1, 2, 3]
height = [100, 200, 300]
plt.bar(left, height, xerr=0.5, yerr=50, ecolor="red", capsize=10)
plt.savefig("bar_graph_python_figure07.jpg")
plt.close()

# ログスケールで表示
left = [1, 2, 3]
height = [100, 200, 300]
plt.bar(left, height, log=True)
plt.savefig("bar_graph_python_figure08.jpg")
plt.close()

# 棒グラフの上部に数値を表示
left = [1, 2, 3]
height = [100, 200, 300]
graph = plt.bar(left, height)

def autolabel(graph):
    for rect in graph:
        height = rect.get_height()
        plt.annotate('{}'.format(height),
            xy=(rect.get_x() + rect.get_width() / 2, height),
            xytext=(0, 3),
            textcoords="offset points",
            ha='center', va='bottom')
autolabel(graph)
plt.savefig("bar_graph_python_figure09.jpg")
plt.close()

# ハッチング
left = [1, 2, 3]
height = [100, 200, 300]
graph = plt.bar(left, height, hatch="+")
plt.savefig("bar_graph_python_figure10.jpg")
plt.close()

# 横棒グラフ
left = [1, 2, 3]
height = [100, 200, 300]
plt.barh(left, height)
plt.savefig("bar_graph_python_figure11.jpg")
plt.close()

# 複数の棒グラフを表示
left = np.arange(3)
height1 = [100, 200, 300]
height2 = [200, 400, 600]
plt.bar(left - 0.35/2, height1, width=0.35)
plt.bar(left + 0.35/2, height2, width=0.35)
plt.savefig("bar_graph_python_figure12.jpg")
plt.close()

# 積み上げ棒グラフ
left = [1, 2, 3]
height1 = [100, 200, 300]
height2 = [200, 400, 600]
plt.bar(left, height1)
plt.bar(left, height2, bottom=height1)
plt.savefig("bar_graph_python_figure13.jpg")
plt.close()

# 凡例を表示
left = [1, 2, 3]
height1 = [100, 200, 300]
height2 = [200, 400, 600]
plt.bar(left, height1, label="Num1")
plt.bar(left, height2, bottom=height1, label="Num2")
plt.legend()
plt.savefig("bar_graph_python_figure14.jpg")
plt.close()
