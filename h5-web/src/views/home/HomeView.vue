<script setup lang="ts">
import { onMounted } from 'vue'
import { showFailToast } from 'vant'
import { useRouter } from 'vue-router'
import { useUserStore } from '../../stores/user'

const router = useRouter()
const userStore = useUserStore()

onMounted(async () => {
  try {
    await userStore.fetchProfile()
  } catch (error) {
    showFailToast(error instanceof Error ? error.message : '加载用户信息失败')
  }
})

function handleLogout() {
  userStore.logout()
  router.replace('/login')
}
</script>

<template>
  <div class="page-shell">
    <div class="stack">
      <section class="card">
        <h1 class="page-title">首页</h1>
        <p class="page-desc">你可以在这里继续扩展商品、订单、预约、活动页等业务模块。</p>
      </section>

      <van-notice-bar left-icon="volume-o" text="当前是演示骨架，接口默认对接本地 8080 端口。" />

      <section class="card">
        <h2 class="section-title">当前登录用户</h2>
        <p class="page-desc">用户名：{{ userStore.profile?.username ?? '加载中' }}</p>
        <p class="page-desc">昵称：{{ userStore.profile?.nickname ?? '加载中' }}</p>
      </section>

      <section class="card">
        <h2 class="section-title">建议你接下来加的模块</h2>
        <van-cell-group inset>
          <van-cell title="列表页" value="例如商品、文章、活动" />
          <van-cell title="详情页" value="展示核心内容" />
          <van-cell title="提交表单" value="预约、报名、下单" />
          <van-cell title="个人中心" value="订单、资料、设置" />
        </van-cell-group>
      </section>

      <van-button round block type="danger" @click="handleLogout">退出登录</van-button>
    </div>
  </div>
</template>
